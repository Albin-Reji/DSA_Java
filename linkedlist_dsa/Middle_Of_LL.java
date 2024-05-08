package linkedlist_dsa;

public class Middle_Of_LL {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 2, 3, 4 };
		Node head = d.arrToLL(arr);
		Node temp = delMidElement(head);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node middle(Node head) {
		int cnt = 0;
		Node temp = head;
		while (temp != null) {
			cnt++;
			temp = temp.next;
		}

		int mid = (cnt / 2) + 1;
		temp = head;

		while (temp != null) {
			mid -= 1;
			if (mid == 0) {
				break;
			}
			temp = temp.next;
		}
		return temp;

	}

	static Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
//			if ()
//				return slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	static Node delMidElement(Node head) {
		if (head.next == null || head == null)
			return null;
		Node slow = head;
		Node fast = head.next.next;
		Node prev = null;
		while (fast != null && fast.next != null) {
			slow = slow.next;

			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;

	}

}
