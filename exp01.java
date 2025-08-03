import java.util.Scanner;

public class exp01 {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insert at the end
    public void insert(int data) {
        head = insertRecursive(head, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = insertRecursive(current.next, data);
        return current;
    }

    // Delete by value
    public void delete(int data) {
        head = deleteRecursive(head, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }
        if (current.data == data) {
            return current.next;
        }
        current.next = deleteRecursive(current.next, data);
        return current;
    }

    // Print the list
    public void printList() {
        printRecursive(head);
    }

    private void printRecursive(Node current) {
        if (current == null) {
            System.out.println("NULL");
            return;
        }
        System.out.print("[ " + current.data + " ] -> ");
        printRecursive(current.next);
    }

    public static void main(String[] args) {
        exp01 list = new exp01(); // Fixed: use the correct class name
        Scanner scanner = new Scanner(System.in);

        // Step 1: Enter elements to be inserted
        System.out.print("How many numbers do you want to insert? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            list.insert(number);
        }

        // Step 2: Print list after insertion
        System.out.print("List after insertion: ");
        list.printList();

        // Step 3: Delete an element
        System.out.print("\nEnter a number to delete: ");
        int deleteNumber = scanner.nextInt();
        list.delete(deleteNumber);

        // Step 4: Print list after deletion
        System.out.print("List after deletion: ");
        list.printList();

        scanner.close();
    }
}
