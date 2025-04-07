class factorial2 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fn1 = factorial(n - 1); 
        int fn = n * fn1;    
        return fn;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = factorial(n); 
        System.out.println("Factorial of " + n + " is: " + result); 
    }
}