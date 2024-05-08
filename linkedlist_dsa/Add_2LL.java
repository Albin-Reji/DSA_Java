package linkedlist_dsa;

class ListNode {
	int val;
	ListNode next;
	ListNode back;

	public ListNode(int data1, ListNode next1) {
		this.val = data1;
		this.next = next1;

	}

	public ListNode(int data1) {
		this.val = data1;
		this.next = null;

	}

}

public class Add_2LL {
	static ListNode arrToLL(int arr[]) {
		ListNode head = new ListNode(arr[0]);
		ListNode mover = head;
		for (int i = 1; i < arr.length; i++) {
			ListNode temp = new ListNode(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;
	}

	static ListNode sum2_LL(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		int carry = 0;
		ListNode ansHead = new ListNode(-1);
		ListNode ansTemp = ansHead;
		while (temp1 != null || temp2 != null) {
			int sum = carry;
			if (temp1 != null)
				sum += temp1.val;
			if (temp2 != null)
				sum += temp2.val;
			ListNode newNode = new ListNode(sum % 10);
			carry = sum / 10;
			ansTemp.next = newNode;
			ansTemp = newNode;
			if (temp1 != null)
				temp1 = temp1.next;

			if (temp2 != null)
				temp2 = temp2.next;
		}
		if (carry != 0) {
			ListNode newNode = new ListNode(carry);
			ansTemp.next = newNode;
		}
		return ansHead.next;
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 5 };
		ListNode head1 = arrToLL(arr1);
		ListNode temp1 = head1;

		while (temp1 != null) {
			System.out.println(temp1.val + " ->" + temp1.next);
			temp1 = temp1.next;
		}
		System.out.println("-------------------------------------------------------------------------------");

		int arr2[] = { 4, 5, 9, 9 };
		ListNode head2 = arrToLL(arr2);
		ListNode temp2 = head2;

		while (temp2 != null) {
			System.out.println(temp2.val + " ->" + temp2.next);
			temp2 = temp2.next;
		}
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
		ListNode ansHead = sum2_LL(head1, head2);
		ListNode ansTemp = ansHead;
		while (ansTemp != null) {
			System.out.println(ansTemp.val + " ->" + ansTemp.next);
			ansTemp = ansTemp.next;
		}

	}

}
