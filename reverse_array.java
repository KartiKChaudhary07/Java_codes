class reverse_array {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int n = 5;
        reverse(arr, 0, n - 1);
        printArray(arr, n);
    }

    

    public static void reverse(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
    }

    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}