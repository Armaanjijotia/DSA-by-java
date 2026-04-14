class Solution {
    int postIndex;
    HashMap<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        map = new HashMap<>();

        // Store inorder index for fast lookup
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int left, int right) {
        if (left > right) return null;

        // Get root from postorder
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        // Find index in inorder
        int index = map.get(rootVal);

        // Build right subtree FIRST
        root.right = build(inorder, postorder, index + 1, right);

        // Then left subtree
        root.left = build(inorder, postorder, left, index - 1);

        return root;
    }
}