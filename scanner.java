import java.util.Scanner;
class scanner{
    public static void main(String[] args){
        System.out.println("Taking inout from the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1");
        int a =sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("the sum of the number are:");
        System.out.println(sum);
    }
}