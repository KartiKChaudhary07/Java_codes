// class constructor_alp{
//     public static void main(String[] args){
//         kartik k=new kartik();//obj
//     }

// }
// class kartik{
//     kartik(){// hamara constructror h bhai
//         System.out.println("kartik kaab seekhe ga");

//     }
// }    

class constructor_alp{
    public static void main (String[] args){
        kartik k= new kartik();// object
        k.name="chaudhary";
        k.roll=32;
        k.password="xyz";
        k.marks[0]=100;
        k.marks[1]=80;
        k.marks[2]=90;
        kartik k2= new kartik(k);
        k2.password="abc";
        for(int i=1;i<3;i++){
            k2.marks[2]=100;
            System.out.println(k2.marks[i]);
        }

    }
}
class kartik{
    String name;
    int roll;
    String password;
    int marks[];// ye saab mai likhna hoga taki saab constructor insure kar paye ki 3 hi marks store ho

        
    kartik(kartik k){
        marks=new int[3];
        this.name=k.name;
        this.roll=k.roll;
        this.marks=k.marks;
    }
    kartik(){
        marks=new int[3];
        System.out.println("KITNA OR KARNA H");
    }
    
    kartik(String name){
        marks=new int[3];
        this.name=name;
        
    }    
    kartik(int roll){
        marks=new int[3];
        this.roll=roll;
    }
  
}