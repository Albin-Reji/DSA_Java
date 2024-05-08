package linkedlist_dsa;

public class ReverseList_II {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 2 };
		Node head = d.arrToLL(arr);
//		reverseLL_II(head, 1, 1);
		Node temp = reverseLL_II(head, 1, 2);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node reverseLL_II(Node head, int left, int right) {
		if (head.next == null)
			return head;
		Node fast = head;
		Node slow = head;
		Node prev = null;
		int n = right - left;
		int cnt = 1;
		if (n == 0) {
			cnt = 0;
		}

		if (left < right) {
			for (int i = 0; i < n; i++) {
				cnt++;
				fast = fast.next;
			}
			while (fast != null && cnt != right) {
				cnt++;
				fast = fast.next;
				prev = slow;
				slow = slow.next;

			}
			Node front = fast.next;
			fast.next = null;
			Node revNode = reverse(slow);
			Node temp = revNode;
			Node dat = prev.next;
			prev.next.next = front;
			prev.next = revNode;
			temp = head;
		}
		return head;

	}

	static Node reverse(Node head) {
		Node prev = null;
		Node temp = head;
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
