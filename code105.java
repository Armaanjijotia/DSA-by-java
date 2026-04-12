class Solution {
    private int preIndex = 0;
    private Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Store inorder values with index
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int left, int right) {
        if (left > right) return null;

        // Pick current root from preorder
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Find root index in inorder
        int index = inorderMap.get(rootVal);

        // Build left and right subtree
        root.left = helper(preorder, left, index - 1);
        root.right = helper(preorder, index + 1, right);

        return root;
    }
}