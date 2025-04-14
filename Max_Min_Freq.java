import java.util.*;

class Max_Min_Freq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 5};
        int n = arr.length;  // Fix 1: Define n
        Frequency(arr, n);   // Call the method with the correct parameter
    }

    // Fix 2: Make the method static
    public static void Frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0, minFreq = n + 1;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }
            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
