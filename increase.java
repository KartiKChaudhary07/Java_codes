class Increase{
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n+" ");
        printInc(n-1);
    }
    public static void main(String[] args){
        int n=10;
        printInc(n);
    }
}