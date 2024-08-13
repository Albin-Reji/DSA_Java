package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static  List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightList=new ArrayList<Integer>();
        rightNodes(root, rightList);
        return rightList;
    }
	static void rightNodes(TreeNode root, List<Integer> rightList) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.add(root);
		rightList.add(root.val);
		while(!queue.isEmpty()) {
			int queueSize=queue.size();
			for(int i=0;i<queueSize;i++) {
				TreeNode popNode=queue.poll();
				if(popNode.left!=null)queue.offer(popNode.left);
				if(popNode.right!=null)queue.offer(popNode.right);
				if(i==queueSize) {
					rightList.add(popNode.val);
				}
			}
		}
	}

}
