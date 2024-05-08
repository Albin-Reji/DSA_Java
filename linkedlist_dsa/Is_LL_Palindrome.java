package linkedlist_dsa;

public class Is_LL_Palindrome {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 1, 0 };
		Node head = d.arrToLL(arr);
		System.out.println(isPalindrome(head));
//		Node temp = reverseLL(head);
//
//		while (temp != null) {
//			System.out.println(temp.data + " ->" + temp.next);
//			temp = temp.next;
//		}

	}

	static boolean isPalindrome(Node head) {
		if (head == null || head.next == null) {
			return true;
		}
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
		Node secondHalf = reverseLL(slow.next);
		Node temp1 = head;
		Node temp2 = secondHalf;
		while (temp2 != null) {
			if (temp1.data != temp2.data) {
				secondHalf = reverseLL(secondHalf);
				return false;
//				
			}
			temp1 = temp1.next;
			temp2 = temp2.next;

		}
		secondHalf = reverseLL(secondHalf);
		return true;
	}

	static Node reverseLL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node temp = head;
		Node prev = null;
		Node forward;
		while (temp != null) {
			forward = temp.next;
			temp.next = prev;
			prev = temp;
			temp = forward;
		}
		return prev;
	}

}
