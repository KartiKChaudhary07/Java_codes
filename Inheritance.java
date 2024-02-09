class base{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
        System.out.println("I am setting x now");
        
    }
}
class Derived extends base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){ 
        this.y=y;
        System.out.println("I am setting y now");
    }

}
public class Inheritance{
    public static void main(String[] args) {
        Derived b= new Derived();
        b.setY(5);
        System.out.println(b.getY());
        
    }
 }

