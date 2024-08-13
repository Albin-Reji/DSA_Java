package binary_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wrapList=new ArrayList<List<Integer>>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null)return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()) {
        	List<Integer> tempList =new ArrayList<Integer>();
        	int queueSize=queue.size();
        	for(int i=0;i<queueSize;i++) {
        		if(queue.peek().left!=null)queue.offer(queue.peek().left);
        		if(queue.peek().right!=null)queue.offer(queue.peek().right);
        		queue.poll();
        	}
        	wrapList.add(tempList);
        }
        return wrapList;
    }

}
