package linkedlist_dsa;

public class LL_Loop {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 3, 2, 0, -4 };
		Node head = d.arrToLL(arr);

		head.next.next.next.next = head.next;
		head = head.next;
		Node temp = head;
//		removeNthFromEnd(head, 3);
//		while (temp != null) {
//			System.out.println(temp.data + " ->" + temp.next);
//			temp = temp.next;
//		}
		System.out.println(hasCycle(head));

	}

	public static boolean hasCycle(Node head) {
		Node temp = head;
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;

	}

}
