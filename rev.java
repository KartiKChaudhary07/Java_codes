import java.util.*;
class rev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=arr.length;j++){
                arr[i][j]=sc.nextInt();
                
                
            }    

        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }


}