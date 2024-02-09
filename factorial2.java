class factorial2{
    public static int  factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        fn1=factorial(n-1);
        fn=n*factorial(n-1);
        return fn;
    }
    public static void main(String[] args){
        int n=10;
        factorial(n);
    }
}