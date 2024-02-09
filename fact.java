class fact{
    public static int fact(int n){
        if(n==1 || n==0){
          System.out.println(n);
          return 1;
        }
        int fn1=fact(n-1);
        int fn2=n*fact(n-1);
        return fn2;
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(fact(n));
    }
}