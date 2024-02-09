class subset{
    public static void findsub(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");

            }
            else{
                System.out.println(ans);
            }
            return;
        }
        findsub(str,ans+str.charAt(i),i+1);
        findsub(str,ans,i+1);
    }
    public static void main(String[] args){
        String str="abc";
        findsub(str," ",0);
    }
}