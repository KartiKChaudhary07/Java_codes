import java.util.Scanner;

class Stack {
    public static final int TOP_STARTING_VALUE = -1;
    private final char[] array;
    int top;
    int size;

    public Stack(int capacity) {
        this.array = new char[capacity];
        this.top = TOP_STARTING_VALUE;
        this.size = 0;
    }

    public void push(char character) {
        if (top == array.length - 1) {
            System.err.println("Stack Overflow");
            return;
        }
        top++;
        array[top] = character;
        size++;
    }

    public char pop() {
        if (isUnderflow()) {
            System.err.println("Stack Underflow");
            return Character.MIN_VALUE; // garbage value (non-printable character)
        }
        size--;
        return array[top--];
    }

    public char peek() {
        if (isUnderflow()) {
            System.err.println("Stack Underflow");
            return Character.MIN_VALUE;
        }
        return array[top];
    }

    public boolean isUnderflow() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}

public class InfixToPostfixConverter {
    public static final int CAPACITY = 100;
    private final Stack operators;

    public InfixToPostfixConverter() {
        this.operators = new Stack(CAPACITY);
    }

    public String convertInfixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        for (int index = 0; index < infixExpression.length(); index++) {
            char symbol = infixExpression.charAt(index);
            if (Character.isLetter(symbol)) {
                postfixExpression.append(symbol);
            } else if (symbol == '(') {
                // push the symbol to the stack
                operators.push(symbol);
            } else if (symbol == ')') {
                // push everything back
                while (operators.peek() != '(') {
                    postfixExpression.append(operators.pop());
                }
                // remove the last (
                operators.pop();
            } else {
                while (!operators.isUnderflow()
                        && !(operators.peek() == '(')
                        && getPrecedence(symbol) <= getPrecedence(operators.peek())
                ) {
                    postfixExpression.append(operators.pop());
                }
                operators.push(symbol);
            }
        }
        while (!operators.isUnderflow()) {
            postfixExpression.append(operators.pop());
        }
        return postfixExpression.toString();
    }

    private int getPrecedence(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/', '%' -> 2;
            default -> 0;
        };
    }
}

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an infix expression: ");
        String infix = scanner.nextLine();
        scanner.close();
        infix = infix.replaceAll("\\s+", "");
        InfixToPostfixConverter converter = new InfixToPostfixConverter();
        String convertedInfixToPostfix = converter.convertInfixToPostfix(infix);
        System.out.println("converted Infix to Postfix => " + convertedInfixToPostfix);
    }
}
