import java.util.*;

public class StackJCF {
    public static void PushAtBottom(Stack<Integer> s, int data) { // Fixed method name
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data); // Fixed recursive call (case-sensitive)
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBottom(s, 4); // Fixed method call (case-sensitive)

        while (!s.isEmpty()) {
            System.out.println(s.pop()); // Fixed syntax
        }
    }
}
