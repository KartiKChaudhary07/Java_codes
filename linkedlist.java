public class linkedlist { // Changed class name to be more standard
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist(); // Changed to the standard class name
        l1.addFirst(4);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(1);
        l1.addLast(7);
        l1.addLast(8);
        l1.addLast(10);
        l1.addLast(9);
        l1.printLL();
    }
}