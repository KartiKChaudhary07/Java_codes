import java.util.*;
class arraylist{
    public static void main(String[] args){
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        l2.add(12);
        l2.add(14);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.addAll(l2);
        for (int i=0;i<l1.size();i++){
            //System.out.println(l1.contains(5));
            System.out.println(", ");

        }


    }
}