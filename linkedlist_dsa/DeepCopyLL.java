package linkedlist_dsa;

import java.util.Random;

class LinkedNode {
	int val;
	LinkedNode next;
	LinkedNode random;

	public LinkedNode(int data1) {
		this.val = data1;
		this.next = null;
		this.random = null;

	}

}

public class DeepCopyLL {

	LinkedNode arrToLL(int arr[]) {
		LinkedNode head = new LinkedNode(arr[0]);
		LinkedNode mover = head;

		for (int i = 1; i < arr.length; i++) {
			LinkedNode temp = new LinkedNode(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;
	}

	LinkedNode randomLink(LinkedNode head) {
		LinkedNode temp = head;
		Random r = new Random();

		while (temp.next != null) {
			int ra = r.nextInt(3);
			if (ra == 1) {
				temp.random = temp.next;
			} else {
				temp.random = head;
			}
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		DeepCopyLL dp = new DeepCopyLL();
		LinkedNode head = dp.arrToLL(arr);

		LinkedNode temp = deepCopy(head);
//		LinkedNode temp = afterCopy(tempy);
		while (temp != null) {
			System.out.println(temp + " " + temp.val + "-> next" + temp.next + "-> random " + temp.random);
			temp = temp.next;
		}

	}

	public static LinkedNode deepCopy(LinkedNode head) {
		LinkedNode copyHead = copyNode(head);
		LinkedNode randoCopyNode = copyNodeRandom(copyHead);
		return afterCopy(randoCopyNode);

	}

	static LinkedNode copyNode(LinkedNode head) {
		LinkedNode temp = head;
		while (temp != null) {
			LinkedNode copyNode = new LinkedNode(temp.val);
			copyNode.next = temp.next;
			temp.next = copyNode;
			temp = temp.next.next;
		}
		return head;
	}

	static LinkedNode copyNodeRandom(LinkedNode head) {
		LinkedNode itr = head;
		while (itr != null) {
			if (itr.random != null)
				itr.next.random = itr.random.next;
			itr = itr.next.next;
		}
		return head;
	}

	static LinkedNode afterCopy(LinkedNode head) {
		LinkedNode temp = head;
		LinkedNode dnode = new LinkedNode(-1);
		LinkedNode res = dnode;
		while (temp != null) {
			res.next = temp.next;
			temp.next = temp.next.next;
			res = res.next;
			temp = temp.next;
		}
		return dnode.next;
	}

}
