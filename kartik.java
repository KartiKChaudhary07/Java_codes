// class kartik{
//     public static void main(String[] args){
//         kartik collage= new kartik();//obj
//         collage.uni();
//     }
// }
// class Anurag{
//     String nothing;
//     void uni(){
//         System.out.println("gla university");
//     }
//     void section(){
//         System.out.println("section h");
//     }
// }
// class kartik extends Anurag{
//     int oooo;
//     void topper(){

//     Sysesm.out.println("anurag");
//     }
// }
class kartik{
    public static void main(String[] args){
    calculator calc=new calculator();//onject bna liya bhai bhalle bhalle
    System.out.println(calc.sum( 1,2));
    System.out.println(calc.sum((float)1.5,(float)2.5));
    System.out.println(calc.sum(3,4,5));

    }
}
class calculator{
    int sum(int a,int b){
        return a + b;
    }
    float sum(float a,float b){
        return a + b;
    }
    int sum(int a,int b,int c){
        return a + b + c;
    }
}