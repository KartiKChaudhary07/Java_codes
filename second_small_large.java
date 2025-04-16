import java.util.*;

public class second_small_large {
    static void find(int arr[], int n) {
        if (n < 2) {
            System.out.println("Not enough elements");
            return;
        }

        int min = Integer.MAX_VALUE, second_min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // Finding min and second min
            if (arr[i] < min) {
                second_min = min;
                min = arr[i];
            } else if (arr[i] < second_min && arr[i] != min) {
                second_min = arr[i];
            }

            // Finding max and second max
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }

        if (second_min == Integer.MAX_VALUE)
            System.out.println("No second smallest (all elements same or only one unique element)");
        else
            System.out.println("Second Smallest: " + second_min);

        if (second_max == Integer.MIN_VALUE)
            System.out.println("No second largest (all elements same or only one unique element)");
        else
            System.out.println("Second Largest: " + second_max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        find(arr, n);
    }
}
