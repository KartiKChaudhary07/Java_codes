class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java is very powerful language";
        String[] words = sentence.split(" ");

        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }

        System.out.println("Longest word: " + longest);
    }
}
