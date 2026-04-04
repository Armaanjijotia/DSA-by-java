import java.util.ArrayList;
import java.util.List;

class Solution {
	
	
	public List<Integer> inorderTraversal(TreeNode root) {
        
//		Stack<TreeNode> path = new Stack<TreeNode>();
//		path.push(root);
		
		List<Integer> res = new ArrayList<Integer>();
		
		if(root != null) {
			res = goFurther(root, res);
		} else return res;
		
		
		System.out.println(res);
		
		return res;
    }
	
	private List<Integer> goFurther(TreeNode node, List<Integer> res) {
		
		boolean nodeAdded = false;
		
		if(node.left != null) {
			goFurther(node.left, res);
			nodeAdded = addNode(node, res, nodeAdded);
		} 
		else {
			nodeAdded = addNode(node, res, nodeAdded);
		}
		if(node.right!=null) {
			goFurther(node.right, res);
			nodeAdded = addNode(node, res, nodeAdded);
		} else {
			nodeAdded = addNode(node, res, nodeAdded);
		}

		return res;
	}
	
	private boolean addNode(TreeNode node, List<Integer> res, boolean nodeAdded) {
		if(!nodeAdded) {
			res.add(node.val);
			return true;
		}
		return false;
	}
	
}