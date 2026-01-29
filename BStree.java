public class BStree {
    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node root;
    // Insert element
    public void insert(int data) {
        root = insertRec(root, data);
    }
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }
    // Search element
    public boolean search(int key) {
        return searchRec(root, key);
    }
    private boolean searchRec(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }
    // Inorder traversal (sorted output)
    public void inorder() {
        inorderRec(root);
    }
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
    // Main
    public static void main(String[] args) {
        BStree bst = new BStree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        System.out.print("Inorder Traversal: ");
        bst.inorder();   // prints sorted data

        System.out.println("\nSearch 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));
    }
}


