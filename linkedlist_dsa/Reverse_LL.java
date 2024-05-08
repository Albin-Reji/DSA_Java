package linkedlist_dsa;

public class Reverse_LL {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 2, 3, 4, 5 };
		Node head = arrToLL(arr);
		Node temp = reverseLL(head);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	public static Node removeNodes(Node head) {
		Node it = reverseLL(head);
		Node temp = it;
		while (temp.next != null) {
			if (temp.next.data < temp.data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return reverseLL(it);

	}

	static Node reverseLL(Node head) {
		Node temp = head;
		Node front = head.next;
		Node prev = null;
		while (temp != null) {
			front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}

}
