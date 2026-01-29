public class EasyCircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) { this.data = data; }
    }

    Node head;

    // Add at front
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;

        while (temp.next != head) temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Delete first node
    public void deleteFirst() {
        if (head == null) return;

        if (head.next == head) { // only one node
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) temp = temp.next;

        head = head.next;   // move head
        temp.next = head;   // last node now points to new head
    }

    // Delete last node
    public void deleteLast() {
        if (head == null) return;

        if (head.next == head) { head = null; return; }

        Node prev = null;
        Node temp = head;

        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = head;
    }

    // Print circular list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(HEAD)");
    }
}
 
    

