package binary_tree;

public class DiamterBT {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);
        System.out.println(maxPathSum(root));

	}
	public static int maxPathSum(TreeNode root) {
		int maxSum[]=new int[1];
		nodeSum(root, maxSum);
		return maxSum[0];
    }
	public static int nodeSum(TreeNode root,int[] maxSum) {
		if(root==null) {
			return 0;
		}
		int lh=nodeSum(root.left, maxSum);
		int rh=nodeSum(root.right, maxSum);
		maxSum[0]=Math.max(lh+rh, maxSum[0]);
		return Math.max(lh, rh)+1;
		
	}
}
