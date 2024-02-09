import java.util.Scanner;
class a201{
    public static void main(String [] args){
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numbers:");
        num=sc.nextInt();
        int arr[]=new int[10];
        System.out.println("enter your numbers:");
        for (int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter your numbers:");
        
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }

    }
}