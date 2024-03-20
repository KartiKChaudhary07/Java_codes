import java.util.Scanner;

class TestClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int numOfElements = scanner.nextInt();
        int[] array = new int[numOfElements];
        for (int index = 0; index < numOfElements; index++) {
            array[index] = scanner.nextInt();
        }
        Sorter sorter = new Sorter();
        int numOfPasses = sorter.bubbleSort(array);
        System.out.println(numOfPasses);
    }
}

class Sorting {
    public int bubbleSort(int[] numbers) {
        int count = 0;
        int n = numbers.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            count++;
            for (int index = 0; index < n - 1; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                    swapped = true;
                }
            }
        }
        return count;
    }
}
