class noSpace {

    public static void main(String[] args) {
        String str = "karti k";
        String a = str.replaceAll("\\s+", "");
        System.out.println(a);
    }
}