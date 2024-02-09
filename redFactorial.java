class redFactorial{
    public static int  fact(int n){
        if(n==0){
            return 1;
        }
        int fn1=fact(n-1);
        int fn2=n*fact(n-1);
        return fn2;
    }
    public static void main(String[] args){
        int n=10;
        System.out.print(fact(n));
    }
}