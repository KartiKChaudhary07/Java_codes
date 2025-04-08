class reverse{
    public static int printDec(int n){
        if(n==0){
            System.out.println(n+" ");
            return 1 ;
        }
        
        printDec(n-1);
        
    }
    public static void main(String[] args){
        int n=10;
       printDec(n);
    }
}