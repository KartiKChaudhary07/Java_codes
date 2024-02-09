import java.util.Scanner;
class a1_4{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[]{num};
        int sum=0;
        
        for (int i=0;i<=arr.length;i++){
            if(i%2==0){
                System.out.println();
            }
            else{
                System.out.println(i);
            }
            sum+=arr[i];

        }
        System.out.println("The sum of age"+sum);

        
        
    }
}