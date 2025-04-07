import java.util.*;
class divisors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num+1];
        
        for(int i=1;i<arr.length;i++){
            if(num%i==0){
                arr[i]=i;
            }
            // else{
            //     i++;
            // }

        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}