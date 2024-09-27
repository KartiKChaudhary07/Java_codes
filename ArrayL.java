import java.util.*;
class ArrayL{
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);

        int element=list.get(2);
        System.out.println(element);

        list.remove(2);
        System.out.println(list);

        list.add(2,10);
        System.out.println(list);

        System.out.println(list.contains(4));

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
} 
