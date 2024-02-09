public class linked01{
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

        public static void addFirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
             newNode.next=head;
             head=newNode;
        }
        public static void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        } 
        public void printll(){
             if(head==null){
                 System.out.println("linked list is empty");
                 return;
        }
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+"");
                temp=temp.next;
            }
            System.out.println();
         }
        public static void main(String[] args){
            linked01 l1=new linked01();
            l1.addLast(1);
            l1.printll();
            l1.addFirst(2);
            l1.printll();
            
            l1.addFirst(3);
            l1.addLast(4);
            l1.printll();
        }
     
 }

