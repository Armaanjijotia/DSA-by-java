public class EasyLinkedList {
    // Node class - each piece of the list
    class Node {
        int data;      // value stored
        Node next;     // link to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Head of the list (start)
    Node head;

    // Add at the front
    public void addFirst(int data) {
        Node newNode = new Node(data); // create new node
        newNode.next = head;           // link it to the old head
        head = newNode;                // update head to new node
    }

    // Add at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete first element
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        head = head.next; // move head to the next node
    }

    // Delete last element
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null; // only one node
            return;
        }

        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }

        secondLast.next = null;
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    // Reverse the list (iterative)
    public void reverseList() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        head = prev;
    }

    // Reverse the list (recursive) 
    public Node reverseRecursively(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Count nodes
    public int getSize() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Main function to test
    public static void main(String[] args) {
        EasyLinkedList list = new EasyLinkedList();

        // Add some elements
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        list.printList(); // 20 -> 10 -> 30 -> 40 -> NULL

        System.out.println("Size: " + list.getSize());

        // Delete first and last
        list.deleteFirst();
        list.deleteLast();
        list.printList(); // 10 -> 30 -> NULL

        // Reverse iteratively
        list.reverseList();
        list.printList(); // 30 -> 10 -> NULL

        // Reverse recursively
        list.head = list.reverseRecursively(list.head);
        list.printList(); // 10 -> 30 -> NULL
    }
}
