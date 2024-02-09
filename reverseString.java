public class reverseString {

    public static void main(String[] args) {
        String str = "KARTIK";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}