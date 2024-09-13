import java.util.*;
class h1{
    public static void main(String[] args) {
        PriorityQueue<Integer> pg=new PriorityQueue<>(Comparator.reverseOrder());
        pg.add(5);
        pg.add(4);
        pg.add(9);
        pg.add(6);
        while(!pg.isEmpty()){
            System.out.println(pg.peek());
            pg.remove();
        }
    }
}