class reverse{
    public static void printDec(int n){
        if(n==0){
            System.out.println(n+" ");
            return;
        }
        
        printDec(n-1);
        
    }
    public static void main(String[] args){
        int n=10;
        printDec(n);
    }
}