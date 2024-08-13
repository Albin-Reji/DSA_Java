package binary_tree;

import java.util.ArrayList;

public class LeastCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
    }
	static boolean getPath(TreeNode root, TreeNode finalNode, ArrayList<Integer> target_Path){
		if(root==null)return false;
		target_Path.add(root.val);
		if(root.val==finalNode.val)return true;
		if(getPath(root.left, finalNode, target_Path)||getPath(root.right, finalNode, target_Path)) {
			return true;
		}
		target_Path.remove(target_Path.size()-1);
		return false;
		
	}

}
