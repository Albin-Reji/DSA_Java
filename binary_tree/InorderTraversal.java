package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);

	}
//	public static  List<Integer> inorderTraversal(TreeNode root) {
//		List<Integer> arr=new ArrayList<Integer>();
//		Stack<TreeNode> stack=new Stack<TreeNode>();
//		stack.push(root);
//		while(!stack.isEmpty()) {
//			
//		}
//	}
//	public List<Integer> inorderTraversal(TreeNode root) {
//		List<Integer> arr=new ArrayList<Integer>();
//		inorderTraversal(root, arr);
//		return arr;
//    }
	
	static void inorderTraversal(TreeNode root, List<Integer> arr) {
		if(root==null) {
			return ;
		}
		inorderTraversal(root.left, arr);
		arr.add(root.val);
		inorderTraversal(root.right, arr);
	}

}
