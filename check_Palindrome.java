class check_Palindrome{
    static boolean palindrome(int i,String s){
        if(i>s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return palindrome(i+1,s);
    }
    public static void main(String[] args){
        String s="madam";
        System.err.println(palindrome(0, s));
    }
}