class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private int helper(TreeNode node) {
        if (node == null) return 0;

        // Get max gain from left & right
        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));

        // Path passing through this node
        int currentSum = node.val + left + right;

        // Update global max
        maxSum = Math.max(maxSum, currentSum);

        // Return max path going up
        return node.val + Math.max(left, right);
    }
}