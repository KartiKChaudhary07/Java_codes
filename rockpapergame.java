import java.util.Scanner;
import java.util.Random;
class rockpapergame{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("rock=0,paper=1,scissors=2");
        int userinput=sc.nextInt();
    
        Random random=new Random();
        int computerinput=random.nextInt(3);
    
        if(userinput==computerinput){
        System.out.println("Draw");
        }
        else if (userinput==0 && computerinput==2 ||userinput==1 && computerinput==0||userinput==2 && computerinput==1){
        System.out.println("You win");
        } else {
        System.out.println("you losee");
        }
        if(computerinput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerinput==1){
            System.out.println("Computer choice: Paper");
        }
        else if(computerinput==2){
            System.out.println("Computer choice: Scissors");
        }
    }
    
    
    
}