import java.util.Scanner;
class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        
        if(n<=1){// ek se chota koi prime number nahi hota
        System.out.println("The number is not prime");
        return;
        }
        for (int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        
        if(count>1){
            System.out.println("Num is not prime");

        }
        else{
            System.out.println("num is prime");
        }
    }
}