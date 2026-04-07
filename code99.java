class Solution {
    TreeNode first = null, second = null, prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        
        // swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        // detect violation
        if (prev != null && prev.val > root.val) {
            // first violation
            if (first == null) {
                first = prev;
            }
            // second violation
            second = root;
        }

        prev = root;

        inorder(root.right);
    }
}