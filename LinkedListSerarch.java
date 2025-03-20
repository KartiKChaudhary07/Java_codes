public class LinkedListSerarch {
    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int search(ListNode head, int target) {
        return searchHelper(head, target, 0);
    }

    private int searchHelper(ListNode node, int target, int index) {
        if (node == null) {
            return -1;  
        }
        if (node.data == target) {
            return index;
        }
        return searchHelper(node.next, target, index + 1);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        LinkedListSerarch ls = new LinkedListSerarch();
        int target = 2;
        int result = ls.search(head, target);

        System.out.println("Element " + target + " found at index: " + result);
    }
}
