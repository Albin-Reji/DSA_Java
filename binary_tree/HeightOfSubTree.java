package binary_tree;

public class HeightOfSubTree {

	public static void main(String[] args) {
	
	}
	
	public int maxPathSum(TreeNode root) {
        int maxSum[]={Integer.MIN_VALUE};
        nodeSum(root, maxSum);
        return maxSum[0];
    }
	
	public static int nodeSum(TreeNode root, int[] maxSum) {
		if(root==null) {
			return 0;
		}
		int leftSum=nodeSum(root.left, maxSum);
		int rightSum=nodeSum(root.right, maxSum);
		
		maxSum[0]=Math.max(leftSum+rightSum+root.val, maxSum[0]);
		return Math.max(leftSum, rightSum)+root.val;
	}
}
