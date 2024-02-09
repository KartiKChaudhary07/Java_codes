class recursion{
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printdec(n-1);
    }
    public static void main(String[] args){
    
        int n=10;
        printdec(n);
        System.out.println();
    }
}