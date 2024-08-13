package binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
		int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int val) {
	    	 this.val = val; 
	     }
	     
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	     }
	     @Override
	     public String toString() {
	    	 return String.valueOf(this.val);
	     }
	       
}
public class PreorderTraversal {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(null);
//		root.right=new TreeNode(2);
//		root.right.left=new TreeNode(3);
//		root.right=new TreeNode(3);
		List<Integer> list=printNodeStrack(root);
		for(Integer i:list) {
			System.out.println(i);
		}

	}
	static List<Integer> printNodeStrack(TreeNode root){
		Stack<TreeNode> st=new Stack<TreeNode>();
		List<Integer> list=new ArrayList<Integer>();
		st.push(root);
		if(root==null)return list;
		while(!st.isEmpty()) {
			TreeNode headNode=st.pop();
			list.add(headNode.val);
			if(headNode.right!=null)st.push(headNode.right);
			if(headNode.left!=null)st.push(headNode.left);
		}
		return list;
	}
//	static void preorder(TreeNode root, ) {
//		if (root==null) {
//			return ;
//		}
//		
//		arr.add(root.val);
//		preorder(root.left, arr);
//		preorder(root.right, arr);
//	}
	
	
//	static void preorders(TreeNode root, List<Integer> arr) {
//		if (root==null) {
//			return ;
//		}
//		arr.add(root.val);
//		preorders(root.left, arr);
//		preorders(root.right, arr);
//	}
//	static List<Integer> printNode(TreeNode root){
//		List<Integer> arr=new ArrayList<Integer>();
//		preorders(root, arr);
//		return arr;
//		
//	}
//	

}
