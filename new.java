class new{
    public static void factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        fn=n*factorial(n);
        System.out.print(n);
    }
    public static void main(String[] args){
        int n=10;
        factorial(n);
    }
}