import java.util.Scanner;
class conditionals{
    public static void main(String[] args){
        
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
       
        
        

        if (age>=18){
            System.out.print("yes you can drive");
            
        }
        else{
            System.out.println("you can't drive srry"); 
                
            }
        }
}