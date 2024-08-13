package binary_tree;

import java.util.ArrayList;
import java.util.Collections;

public class TopViewBT {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(10);
//        root.left.left.right = new TreeNode(5);
//        root.left.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(10);
//        root.right.left = new TreeNode(9);
        System.out.println(topView(root));

	}
	static ArrayList<Integer> topView(TreeNode root) {
		ArrayList<Integer> topviewList=new ArrayList<Integer>();
		leftBoundary(root, topviewList);
		rightBoundary(root.right, topviewList);
		return topviewList;
    }
	static void leftBoundary(TreeNode root, ArrayList<Integer> leftNodesArrayList){
		while(root!=null) {
			leftNodesArrayList.add(root.val);
			if(root.left!=null) {
				root=root.left;
			}
			else {
				root=root.right;
			}
		}
		Collections.reverse(leftNodesArrayList);
		
	}
	static void rightBoundary(TreeNode root, ArrayList<Integer> rightNodesList){
		while(root!=null) {
			rightNodesList.add(root.val);
			if(root.right!=null) {
				root=root.right;
			}
			else {
				root=root.left;
			}
		}
		
		
	}

}
