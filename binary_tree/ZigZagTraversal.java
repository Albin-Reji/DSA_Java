package binary_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        List<Integer> levelList=new ArrayList<Integer>();
        List<List<Integer>>zigzagList=new ArrayList<List<Integer>>();
        queue.offer(root);
        int flag=0;
        while(!queue.isEmpty()) {
        	int queueSize=queue.size();
        	for(int i=0;i<queueSize;i++) {
        		TreeNode popNode=queue.poll();
        		levelList.add(popNode.val);
        		if(popNode.left!=null)queue.offer(popNode.left);
        		if(popNode.right!=null)queue.offer(popNode.right);
        	}
        	if(flag==1) {
        		Collections.reverse(levelList);
        		flag=0;
        	}
        	else {
        		flag=1;
        	}
        	zigzagList.add(levelList);
        	
        }
        return zigzagList;
        
    }

}
