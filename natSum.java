class natSum{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int var1=sum(n-1);
        int var2=n + var1;
        return var2;
    }
    public static void main(String[] args){
        int n=10;
        System.out.print(sum(n));
    }
}