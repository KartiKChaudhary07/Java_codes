import java.util.*;

class Palindrome {
    static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;

        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }

        return rev == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
