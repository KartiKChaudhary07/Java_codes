import java.util.Arrays;

class Sorter{
    public void sort(String [] numbers){
        for (int counter=0;counter<numbers.length;counter++ ) {
            for (int index=0;index<numbers.length-1;index++) {
                if(numbers[index].compareTo(numbers[index+1])>0){
                    String temp=numbers[index];
                    numbers[index]=numbers[index+1];
                    numbers[index+1]=temp;
                }
            }
        }

    }
}
class Main{
    public static void main(String[] args) {
        String[] numbers=new String[]{"kartik"};
        System.out.println(Arrays.toString(numbers));
        Sorter sorter=new Sorter();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}


//import java.util.Arrays;
//
//class Sorter{
//    public void sort(int [] numbers){
//        for (int counter=0;counter<numbers.length;counter++ ) {
//            for (int index=0;index<numbers.length-1;index++) {
//                if(numbers[index]>numbers[index+1]){
//                    int temp=numbers[index];
//                    numbers[index]=numbers[index+1];
//                    numbers[index+1]=temp;
//                }
//            }
//        }
//
//    }
//}
//class Main{
//    public static void main(String[] args) {
//        int[] numbers=new int[]{9,2,3,4,5,6,7,8,1};
//        System.out.println(Arrays.toString(numbers));
//        Sorter sorter=new Sorter();
//        sorter.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//    }
//}