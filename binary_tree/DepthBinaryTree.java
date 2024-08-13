package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class DepthBinaryTree {

	public static void main(String[] args) {
		

	}
	 public static int maxDepth(TreeNode root) {
		 if(root==null)return 0;
		 Queue<TreeNode> queue=new LinkedList<TreeNode>();
		 int level=0;
		 queue.offer(root);
		 while(!queue.isEmpty()) {
			 int queueSize=queue.size();
			 for(int i=0;i<queueSize;i++) {
				 TreeNode popNode=queue.poll();
				 if(popNode.left!=null)queue.offer(popNode.left);
				 if(popNode.right!=null)queue.offer(popNode.right);
			 }
			 level++;
		 }
		 return level;
	 }
	 
	 

}
