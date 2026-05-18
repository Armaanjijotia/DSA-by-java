import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);      // Step 1: Root
        preorder(node.left, result);  // Step 2: Left
        preorder(node.right, result); // Step 3: Right
    }
}