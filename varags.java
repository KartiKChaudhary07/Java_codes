class Varargs {
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs methods:-");
        System.out.println("The sum of 4 and 5 is " + sum(4, 5));
        System.out.println("The sum of 3, 6, and 7 is " + sum(3, 6, 7));
    }
}
