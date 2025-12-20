import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1, number2;
        System.out.print("Enter first number: ");
        number1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        number2 = sc.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + (number1 + number2) + ", "
                + (number1 - number2) + ", "
                + (number1 * number2) + ", "
                + (number1 / number2));

        sc.close();
    }
}
