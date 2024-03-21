class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class LL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        LL solution = new LL();

        // Reversing the list
        ListNode reversedHead = solution.reverseList(head);

        // Printing the reversed list
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}
