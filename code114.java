class Solution {
    public void flatten(TreeNode root) {
        if (root == null) return;

        // Flatten left and right
        flatten(root.left);
        flatten(root.right);

        // Store left and right
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Make left as right
        root.left = null;
        root.right = left;

        // Go to end of new right chain
        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }

        // Attach original right
        curr.right = right;
    }
}