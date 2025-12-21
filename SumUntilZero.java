import java.util.*;
class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, num;

        while ((num = sc.nextDouble()) != 0)
            total += num;

        System.out.println("Sum = " + total);
        sc.close();
    }
}
