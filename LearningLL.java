public class LearningLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        // // ADDED: so System.out.println(head) prints the value, not a memory address
        // @Override
        // public String toString() {
        // return "Node(" + val + ")";
        // }
    }

    static ListNode deleteNode(ListNode head) {
        if (head == null)
            return null; // ADDED: guard against null head
        head = head.next;
        return head;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 35, 61, 4 };
        ListNode head = arrtoLL(arr); // CHANGED: loop does the work, no manual chaining needed

        System.out.println(head); // prints: Node(2)
        head = deleteNode(head);
        System.out.println(head); // prints: Node(35)
        // LearningLL node1 = new LearningLL();
        // node1.ListNode =
        // ListNode a = new ListNode();
        // a.val = 2;
        // ListNode b = new ListNode();
        // b.val = 3;
        // ListNode c = new ListNode();
        // c.val = 4;
        // a.next = b;
        // b.next = c;
        // System.out.println(a.val);
    }
}
