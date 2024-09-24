import java.util.Scanner;

public class mergesort {

    // Function to merge two sorted subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        // Merge the two sorted arrays
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Function to split the array and call merge
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively sort both halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner sc = new Scanner(System.in);

        // Take array size input from the user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare an array of size n
        int[] array = new int[n];

        // Take array elements input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Display the original array
        System.out.println("Original Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Call mergeSort function to sort the array
        mergeSort(array, 0, array.length - 1);

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
