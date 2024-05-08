package doubly_linkedlist;

class Node {
	int data;
	Node next;
	Node back;

	public Node(int data1, Node next1, Node back1) {
		this.data = data1;
		this.next = next1;
		this.back = back1;
	}

	public Node(int data1) {
		this.data = data1;
		this.next = null;
		this.back = null;
	}

}

public class Doubly_LinkedList {

	static Node arrToLL(int arr[]) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			temp.back = mover;
			mover.next = temp;
			mover = temp;

		}
		return head;
	}

	static Node insertAtHead(Node head, int data) {
		Node temp = head;
		Node newNode = new Node(data, temp, null);
		temp.back = newNode;
		head = newNode;
		return head;
	}

	static Node inserAtLast(Node head, int data) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(data, null, temp);
		temp.next = newNode;
		return head;

	}

	static Node insertAtKthPosition(Node head, int data, int pos) {
		int cnt = 0;
		Node temp = head;
		if (pos == 1)
			return insertAtHead(head, data);
		while (temp != null) {
			cnt++;
			if (cnt == pos) {
				break;
			}
			temp = temp.next;

		}
		Node p = temp.back;
		Node newNode = new Node(data, temp, p);
		p.next = newNode;
		temp.back = newNode;

		return head;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		Node head = arrToLL(arr);
		Node temp = insertAtKthPosition(head, 1000, 5);

		while (temp != null) {
			System.out.println(temp.back + " <- " + temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

}
