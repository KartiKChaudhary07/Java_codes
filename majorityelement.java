import java.util.*;

class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4}; // Example array
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int n = arr.length;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean found = false;
        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No majority element found.");
        }
    }
}
