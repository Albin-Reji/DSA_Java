package binary_tree;

public class BalancedBT {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        System.out.println(isBalanced(root));
	}
	public static  boolean isBalanced(TreeNode root) {
		return height(root)!=-1;
    }
	static int  height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=height(root.left);
		if(leftHeight==-1)return -1;
		int rightHeight=height(root.right);
		if(rightHeight==-1)return -1; 
		
		if(Math.abs((rightHeight-leftHeight))>1) {
			return -1;
		}
		return 1+Math.max(leftHeight, rightHeight);
	}

}
