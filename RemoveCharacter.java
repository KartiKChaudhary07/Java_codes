class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char remove = 'l';
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove)
                result += str.charAt(i);
        }

        System.out.println("Modified String: " + result);
    }
}
