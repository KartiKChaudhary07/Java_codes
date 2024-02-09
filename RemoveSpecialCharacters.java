import java.util.regex.Pattern;

public class RemoveSpecialCharacters {

    public static void main(String[] args) {
        String string = "This is a string with special characters!@#$%^&*()";
        String regex = "[^\\w\\s]";
        Pattern pattern = Pattern.compile(regex);
        String filteredString = pattern.matcher(string).replaceAll("");

        System.out.println(filteredString);
    }
}