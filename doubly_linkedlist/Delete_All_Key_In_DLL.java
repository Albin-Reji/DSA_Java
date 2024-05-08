package doubly_linkedlist;

class Node {
	int data;
	Node next;
	Node prev;

	public Node(int data1, Node next1, Node back1) {
		this.data = data1;
		this.next = next1;
		this.prev = back1;
	}

	public Node(int data1) {
		this.data = data1;
		this.next = null;
		this.prev = null;
	}

}

public class Delete_All_Key_In_DLL {

	static Node arrToLL(int arr[]) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			temp.prev = mover;
			mover.next = temp;
			mover = temp;

		}
		return head;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 10, 10, 6, 10 };
		Node head = arrToLL(arr);

		Node temp = delOcuurancesDLL(head, 10);
		while (temp != null) {
			System.out.println(temp.prev + " <-" + temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node delOcuurancesDLL(Node head, int k) {
		Node back = null;
		Node front = null;
		Node temp = head;
		head.prev = back;
		while (temp != null) {
			front = temp.next;
			back = temp.prev;
			if (temp.data == k && temp == head) {
				head = temp.next;

			} else if (temp.data == k && temp.next != null) {
				front.prev = back;
				back.next = front;

			} else if (temp.data == k && temp.next == null) {
				back.next = null;

			}
			temp = temp.next;
		}
		return head;
	}

}
