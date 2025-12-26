class ReplaceWord {
    static String replace(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "Java is easy";
        System.out.println(replace(sentence, "easy", "powerful"));
    }
}
