public class linkedlist {
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

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6 };
        Node node = new Node(arr[0]);
        Node mover = node;
        for (int i = 1; i < arr.length; i++) {
            mover = new Node(arr[i]);
            System.out.println(mover.data);
            mover = mover.next;
        }
        // System.out.println(node.data);
    }
}
