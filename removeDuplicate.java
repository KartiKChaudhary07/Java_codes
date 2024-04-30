import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        Set<Character> set = new LinkedHashSet<>(); 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
