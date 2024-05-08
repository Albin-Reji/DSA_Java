package doubly_linkedlist;

import java.util.Stack;

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

public class Reverse_DLL {
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

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		Node head = arrToLL(arr);
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.back + " <- " + temp.data + " ->" + temp.next);
			temp = temp.next;
		}

		System.out.println("--------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------");
		temp = reverse_DLL_(head);

		while (temp != null) {
			System.out.println(temp.back + " <- " + temp.data + " ->" + temp.next);
			temp = temp.next;
		}
//		Stack<Integer> st = reverseDLL(head);
//		int l = st.size();
//		for (int i = 0; i < l; i++) {
//			System.out.println(st.pop());
//		}
	}

	static Node reverse_DLL_(Node head) {
		Node ptr = head;
		Node prev = null;
		while (ptr != null) {
			prev = ptr.back;
			ptr.back = ptr.next;
			ptr.next = prev;

			ptr = ptr.back;
		}
		return prev.back;
	}

	static Node reverseDLL(Node head) {
		Stack<Integer> st = new Stack<>();
		Node temp = head;

		while (temp != null) {
			st.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			temp.data = st.pop();
			temp = temp.next;
		}
		return head;
	}

}
