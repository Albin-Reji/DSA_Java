package linkedlist_dsa;

public class RotateLL {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Node head = d.arrToLL(arr);
		Node temp = rotateLL(head, 3);
		;
		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}
		rotateLL(head, 11);

	}

	static Node rotateLL(Node head, int k) {
		int cnt = 0;
		Node temp = head;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}
		k = k % cnt;
		Node newHead = reverseLL(head);
		int i = 0;
		temp = newHead;
		while (temp != null) {
			i++;
			if (i == k) {
				Node nextNode = temp.next;
				temp.next = null;
				Node first = reverseLL(newHead);
				Node second = reverseLL(nextNode);
				newHead.next = second;
				newHead = first;
			}
			temp = temp.next;
		}
		return newHead;

	}

	static Node reverseLL(Node head) {
		Node temp = head;
		Node prev = null;
		Node front;
		while (temp != null) {
			front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}

}
