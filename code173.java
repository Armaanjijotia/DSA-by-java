import java.util.Stack;

class BSTIterator {

    Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    private void pushLeft(TreeNode node) {
        while (node != null) {
            st.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode curr = st.pop();

        if (curr.right != null) {
            pushLeft(curr.right);
        }

        return curr.val;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }
}