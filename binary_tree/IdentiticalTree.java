package binary_tree;

public class IdentiticalTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null) {
			return true;
		}
		if(p==null||q==null) {
			return false;
		}
		return p.val==q.val&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
	
	

}
