public class Sum_N_digits {
    static int Sum(int n){
        int sum = 0;
        if(n<=0) return 0;
        return n+Sum(n-1);
    }
    public static void  main(String[] args){
        System.out.println(Sum(5));
    }
}
