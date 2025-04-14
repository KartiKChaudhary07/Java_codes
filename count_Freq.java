import java.util.*;

class count_Freq {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 1, 2};
        int n = arr.length;
        freq(arr, n);
    }

    public static void freq(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
