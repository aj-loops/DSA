public class arrtoLL {
    public static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node arr2ll(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        Node head = arr2ll(arr);
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.data + "->");
            mover = mover.next;
        }
        System.out.println("null");
    }
}
