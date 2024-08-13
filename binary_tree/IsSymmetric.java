package binary_tree;

public class IsSymmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return checkSymmetric(root.left, root.right)
		
    }
	public static boolean  checkSymmetric(TreeNode root1, TreeNode root2) {
		if(root1==null||root2==null) {
			return root1==root2;
		}
		return root1.val==root2.val&&checkSymmetric(root1.left, root2.left)&&checkSymmetric(root1.right, root2.right);
		
		
	}

}
