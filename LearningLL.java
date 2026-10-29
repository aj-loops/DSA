public class LearningLL {

    // Delete the head node of a list created by arrtoLL
    static arrtoLL.Node deleteNode(arrtoLL.Node head) {
        if (head == null) return null;
        return head.next;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 35, 61, 4 };
        // Reuse the existing arrtoLL class to convert the array to a linked list
        arrtoLL.Node head = arrtoLL.arr2ll(arr);

        // Print the first element
        System.out.println(head.data); // prints: 2
        // Delete the head node
        head = deleteNode(head);
        // Print the new head element after deletion
        System.out.println(head.data); // prints: 35
    }
}
