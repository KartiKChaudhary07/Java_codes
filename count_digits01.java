import java.util.*;
class count_digits01{
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        while(N>0){
            count++;
            N=N/10;
        }
        System.out.print(count);
    }    
}