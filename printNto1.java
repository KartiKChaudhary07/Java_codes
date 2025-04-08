public class printNto1 {
    static void printnum(int n){
        if(n==0) return;
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String[] args){
        printnum(5);
    }
}
