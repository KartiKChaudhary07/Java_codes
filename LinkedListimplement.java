public class LinkedListimplement {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;  // Fix: Ensure the new node's next pointer is null
        }
    }

    public Node head;
    public Node tail;

    public void add(int index, int data) {
        Node newNode = new Node(data);

        if (index == 0) {  // Case 1: Insert at the beginning
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 0;

        // Traverse to the (index-1)th position
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {  // Case 2: Index is out of bounds
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // Update tail if the node is added at the end
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void printList() {  // Method to print the linked list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListimplement L1 = new LinkedListimplement();
        
        // Creating initial list
        L1.head = new Node(1);
        L1.head.next = new Node(2);
        L1.tail = L1.head.next;  // Fix: Set the tail correctly

        System.out.println("Before insertion:");
        L1.printList(); // Output: 1 -> 2 -> null

        L1.add(2, 5); // Inserting at index 2

        System.out.println("After insertion:");
        L1.printList(); // Output: 1 -> 2 -> 5 -> null
    }
}
