package binary_tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> arr=new ArrayList<Integer>();
		inorderTraversal(root, arr);
		return arr;
    }
	
	static void inorderTraversal(TreeNode root, List<Integer> arr) {
		if(root==null) {
			return ;
		}
		inorderTraversal(root.left, arr);
		arr.add(root.val);
		inorderTraversal(root.right, arr);
	}

}
