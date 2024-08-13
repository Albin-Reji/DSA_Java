package binary_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	@Override
	  public String toString() {
	    return String.valueOf(this.data);
	  }
}

public class BinaryTree {

	public static void main(String[] args) {
//		Node root=new Node(1);
//		root.left=new Node(2);
//		root.right=new Node(3);
//		
//		System.out.println(root.left+" "+root+" "+root.right+" "+root.right.left+" "+root.right.right);
		List<Integer> levelList=new ArrayList<Integer>();
		levelList.add(2);
		levelList.add(3);
		levelList.add(4);
		Collections.reverse(levelList);
		for (int i:levelList) {
			System.out.println(i);
		}
	}

}
