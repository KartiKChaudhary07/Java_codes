
import java.util.*;
public class Largest_element01 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    
}
