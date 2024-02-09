import java.util.Scanner;
class a1_2{
    public static void main(String[] args){
        int num;
        System.out.println("enter the value");
        Scanner n= new Scanner(System.in);
        num =n.nextInt();
        
        for (int i=0;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
            else{
                System.out.println();
            }
        }

    }
}