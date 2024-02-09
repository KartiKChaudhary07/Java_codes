import java.util.*;
public static int Calculatesum(int num1,int num2){
    int sum=int num1+int num2;
    return sum;
}
class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=Calculatesum(a,b);
        System.out.println("the sum is "+sum);
    }
}