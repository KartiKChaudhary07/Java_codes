class varags{
    public static void main(String[] args){
        static int sum(int ...arr){
            int result=0;
            for(int a:arr){
                result+=a;

            }
            return result;

        }
        public static void main(String[] args) {
            System.out.println("Wrlcome to varags methods:-");
            System.out.println("The sum of 4 and 5 is"+ sum(...arr:4,5));
            System.out.println("The sum of 3,6 and 7 is"+ sum(...arr:3,6,7));
            

            
        }
    }
}