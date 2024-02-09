public class linkedList01{
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main (Strings[] args){
        linkedList01 l1=new linkedList01();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addLast(5);
        l1.addLast(8);

    }
}