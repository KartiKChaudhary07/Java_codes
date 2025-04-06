import java.util.*;
public class printName {
    static void print(String s,int n){
        if(n<=0)return;
        System.out.println(s);
        print(s,n-1);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        print(s,n);

    }
}
