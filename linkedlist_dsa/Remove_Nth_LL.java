package linkedlist_dsa;

public class Remove_Nth_LL {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 4, 3 };
		Node head = d.arrToLL(arr);
		Node temp = removeNthFromEnd(head, 2);
//		removeNthFromEnd(head, 3);
		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node removeNthFromEnd(Node head, int n) {
		Node fast = head;
		Node slow = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		if (fast == null) {
			head = head.next;
			return head;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;
		return head;

	}

}
