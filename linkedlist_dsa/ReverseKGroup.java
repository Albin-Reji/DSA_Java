package linkedlist_dsa;

public class ReverseKGroup {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ListNode head = d.arrToLL(arr);
		ListNode temp = reverseKGroup(head, 3);
//
		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static ListNode reverseKGroup(ListNode head, int k) {
		ListNode temp = head;
		ListNode nextNode;
		ListNode Knode;
		ListNode newHead;
		ListNode prev = null;

		while (temp != null) {
			Knode = returnKNode(temp, k);

			if (Knode == null) {
				if (prev != null) {
					prev.next = temp;
					break;
				}

			}
			nextNode = Knode.next;
			Knode.next = null;
			newHead = reverseLL(temp);
			if (temp == head) {
				head = newHead;
			} else {
				prev.next = Knode;
			}
			prev = temp;
			temp = nextNode;

		}
		return head;
	}

	static ListNode returnKNode(ListNode temp, int k) {
//		k -= 1;
//		while (temp != null && k > 0) {
//			k--;
//			temp = temp.next;
//		}
//		return temp;
		for (int i = 1; i < k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	static ListNode reverseLL(ListNode head) {
		ListNode prev = null;
		ListNode temp = head;
		ListNode front;
		while (temp != null) {
			front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}

}
