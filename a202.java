import java.util.Scanner;
class a202{
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        
        num=sc.nextInt();
        int arr[]=new int[5];
        
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr.length-1;i--){
            System.out.println(arr[i]+" ");

        }
        
    }
}