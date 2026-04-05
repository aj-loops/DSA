public class linklist {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        Node node1 = new Node(1);
        // node1.data = 1;
        // node1.next = null;
        System.out.println(node1);
    }
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
}
