import java.util.Scanner;
class cbse{
    public static void main(String[] args){
        System.out.println("Marks distribution of cbse");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of subject 1");
        float marks1= sc.nextFloat();
        System.out.println("Enter marks of subject 2");
        float marks2= sc.nextFloat();
        System.out.println("Enter marks of subject 3");
        float marks3= sc.nextFloat();
        System.out.println("Enter marks of subject 4");
        float marks4= sc.nextFloat();
        System.out.println("Total marks you get:");
        float sum=marks1+marks2+marks3+marks4;
        System.out.println(sum);
        float perc=(sum/400)*100;
        System.out.println(perc);

    }
}