import java.util.*;
public class 2darray{
    public static void main(String[] args){
        int martix[][]=new int[3][3];
        int n=matrix.length,m = matrix[0].length;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
} 