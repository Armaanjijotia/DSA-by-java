public class EasyDoublyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) { this.data = data; }
    }
    Node head;
    // Add at front
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }
    // Delete first node
    public void deleteFirst() {
        if (head == null) return;

        if (head.next == null) { head = null; return; }

        head = head.next;
        head.prev = null;
    }

    // Delete last node
    public void deleteLast() {
        if (head == null) return;

        if (head.next == null) { head = null; return; }

        Node temp = head;

        while (temp.next != null) temp = temp.next;

        temp.prev.next = null;
    }

    // Print
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print("<-" + temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
