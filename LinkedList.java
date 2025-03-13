
public class LinkedList {

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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // note that LinkedList is the name of the file so direclty the name if the class of this file. noticce okay!
        ll.addLast(1);
        ll.addLast(2);
    }
}
