class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution03 {
    public static void main(String[] args) {
        // Example usage:
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution03 solution = new Solution03();

        // Output the original list
        System.out.println("Original List:");
        printList(head);

        // Perform the reorder operation
        solution.reorderList(head);

        // Output the modified list
        System.out.println("\nModified List:");
        printList(head);
    }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newNode = reverseList(slow.next);
        slow.next = null;
        ListNode curr = head;
        ListNode dummy = newNode;
        while(curr!=null && dummy!=null) {
            ListNode temp = curr.next;
            curr.next = dummy;
            ListNode temp2 = dummy.next;
            dummy.next = temp;
            curr = temp;
            dummy = temp2;
        }
    }

    public ListNode reverseList(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
