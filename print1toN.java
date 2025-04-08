public class print1toN {
    static void printnum(int n, int i) {
        if (n > i) {
            return;
        }
        System.out.print(n + " ");
        printnum(n + 1, i);
    }

    public static void main(String[] args) {
        printnum(1, 10);
    }
}
