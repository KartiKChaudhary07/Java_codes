class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out .println("my name is \n"+ name +"\n"+"and My id is"+id);
    }

}
public class custom_class{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee kartik= new Employee();
        kartik.id=32;
        kartik.name="Kartik chaudhary";
        //System.out.println(kartik.id);
        //System.out.println(kartik.name);

        kartik.printdetails();  
        
    }
    
}