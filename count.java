import java.util.*;

class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int cnt = (a == 0) ? 1 : (int) (Math.log10(a) + 1);

        System.out.println(cnt);
        sc.close(); 
    }
}
