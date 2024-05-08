package linkedlist_dsa;

class Node {
	int data;
	Node next;

	public Node(int data1, Node next1) {
		this.data = data1;
		this.next = next1;
	}

	public Node(int data1) {
		this.data = data1;
		this.next = null;

	}

}

public class Dutch_Nationl_FlagLL {

	Node arrToLL(int arr[]) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 0, 0, 1, 2, 2, 1, 0 };
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();
		Node head = d.arrToLL(arr);
		Node temp = dutchNationalFlag_LL(head);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node dutchNationalFlag_LL(Node head) {
		Node L0 = new Node(-1);
		Node zeroptr = L0;
		Node zero = L0;
		Node L1 = new Node(-1);
		Node oneptr = L1;
		Node one = L1;
		Node L2 = new Node(-1);
		Node twoptr = L2;
		Node temp = head;
		Node two = L2;
		while (temp != null) {
			int data = temp.data;
			Node newNode = new Node(data);
			if (data == 0) {
				zeroptr.next = newNode;
				newNode.next = null;
				zeroptr = newNode;
				temp = temp.next;
			} else if (data == 1) {
				oneptr.next = newNode;
				newNode.next = null;
				oneptr = newNode;
				temp = temp.next;
			} else {
				twoptr.next = newNode;
				newNode.next = null;
				twoptr = newNode;
				temp = temp.next;
			}

		}
		head = zero.next;
		zeroptr.next = one.next;
		oneptr.next = two.next;
		return head;

	}

}
