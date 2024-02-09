//import java.util.*;
class bubblesort{
    public static int bubblesort(int a[]){
        for (int turn=0;turn<a.length-1;turn++){
            for(int j=0;j<a.length-1-turn;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return -1;
    }
    public static void printarr(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }    
        

    public static void main(String[] args){
        int a[]={3,4,6,2,1,5,7};
        bubblesort(a);
        printarr(a);
    }    

    
}