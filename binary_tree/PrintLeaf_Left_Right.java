package binary_tree;

import java.util.ArrayList;
import java.util.Collections;

public class PrintLeaf_Left_Right {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        ArrayList<Integer> ansList=leftBoundary(root);
        
        ArrayList<Integer> leafList=printLeafNodes(root);
        for(Integer i: leafList ) {
        	ansList.add(i);
        }
//        
        ArrayList<Integer> rightList=rightBoundary(root);
        Collections.reverse(rightList);
        for(Integer i: rightList ) {
        	ansList.add(i);
        }
        System.out.print("[");
        for(Integer i:ansList) {
        	System.out.print(i+" ");
        }
        System.out.print("]");
	}
	static ArrayList<Integer> printLeafNodes(TreeNode root){
		ArrayList<Integer> leafList=new ArrayList<Integer>();
		leafFunc(root, leafList);
		return leafList;
	}
	static void leafFunc(TreeNode root, ArrayList<Integer> leafList){
		if(root.left==null&&root.right==null) {
			leafList.add(root.val);
			return ;
		}
		if(root.left!=null) {
			leafFunc(root.left, leafList);
		}
		if(root.right!=null) {
			leafFunc(root.right, leafList);
		}
		
	}
	static ArrayList<Integer> leftBoundary(TreeNode root){
		ArrayList<Integer> leftList=new ArrayList<Integer>();
		leftBoundaryFunc(root, leftList);
		return leftList;
	}
	static void leftBoundaryFunc(TreeNode root, ArrayList<Integer> leftList) {
//		root=root.left;
		while(root.left!=null) {
			leftList.add(root.val);
			if(root.left!=null) {
				root=root.left;
			}
			else{
				root=root.right;
			}
			
		}
	}
	static ArrayList<Integer> rightBoundary(TreeNode root){
		ArrayList<Integer> rightList=new ArrayList<Integer>();
		rightBoundaryFunc(root, rightList);
		return rightList;
	}
	static void rightBoundaryFunc(TreeNode root, ArrayList<Integer> rightList) {
		root=root.right;
		while(root.right!=null) {
			rightList.add(root.val);
			if(root.right!=null) {
				root=root.right;
			}
			else {
				root=root.left;
			}
			
		}
	}

}
