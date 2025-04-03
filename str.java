class str{
    public static void printletter(String str){
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        String firstname="kartk";
        String secondname="chaudhary";
        String fullName=firstname+"  "+secondname;

        
        printletter(fullName);
    }
}