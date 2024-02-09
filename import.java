import java.util.in;
class import{
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch(age){
            case 16:
            System.out.println("normal driver");
            break;

            case 18:
            System.out.println("better than normal driver");
            break;

            case 20:
            System.out.println("experinced driver");
            break;

            case 23:
            System.out.println("Heavy driver");
            break;

            default:
            System.out.print("Dont touch the vechiles");
        }

        
    }

}