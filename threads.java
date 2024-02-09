class mytheread extends Thread{
    public void run(){
        int i=0;

        while(i<100){
            System.out.println("this is my thread 1");
            System.out.println("same as thread 1");

        }

    }
    
}
class mytheread2 extends Thread{
    public void run(){
        int i=0;
        while(i<100)
        while(true){
            System.out.println("this is my thread 2");
            System.out.println("same as thread 22");
        }
    }
}
public class threads{
    public static void main(String[] args) {
    mytheread t1=new mytheread();
    mytheread2 t2=new mytheread2();
    t1.start();
    t2.start();
    }
}

