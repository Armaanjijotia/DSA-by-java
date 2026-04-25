class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node leftmost = root;

        while (leftmost.left != null) {
            Node current = leftmost;

            while (current != null) {
                // Connect left → right
                current.left.next = current.right;

                // Connect right → next subtree
                if (current.next != null) {
                    current.right.next = current.next.left;
                }

                current = current.next;
            }

            // Move to next level
            leftmost = leftmost.left;
        }

        return root;
    }
}