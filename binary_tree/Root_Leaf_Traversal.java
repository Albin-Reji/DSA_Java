package binary_tree;
import java.util.ArrayList;
import java.util.List;

// TreeNode structure


public class Root_Leaf_Traversal {

    public boolean getPath(TreeNode root, List<Integer> target_Path, int finalNode) {
    	if(root==null)return false;
		if(root.val==finalNode)return true;
		target_Path.add(root.val);
		if(getPath(root.left, finalNode, target_Path)||getPath(root.right, finalNode, target_Path)) {
			return true;
		}
		target_Path.remove(target_Path.size()-1);
		return false;
    }

    public List<Integer> solve(TreeNode A, int B) {
    	List<Integer> ansList=new ArrayList<Integer>();
        if(A==null)return ansList;
        getPath(A, ansList, B);
        return ansList;
        
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Root_Leaf_Traversal sol = new Root_Leaf_Traversal();

        int targetLeafValue = 7;

        List<Integer> path = sol.solve(root, targetLeafValue);

        System.out.print("Path from root to leaf with value " +
                targetLeafValue + ": ");
        for (int i = 0; i < path.size(); ++i) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
    }
}