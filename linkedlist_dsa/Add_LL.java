package linkedlist_dsa;

public class Add_LL {
	public static void main(String args[]) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr1[] = { 7, 2, 4, 3 };
		int arr2[] = { 5, 6, 7 };
		Node head1 = d.arrToLL(arr1);
		Node temp1 = reverse(head1);

		while (temp1 != null) {
			System.out.println(temp1.data + " ->" + temp1.next);
			temp1 = temp1.next;
		}
		System.out.println("__________________________________________________");
//		Node head2 = d.arrToLL(arr2);
//		Node temp2 = head2;
//
//		while (temp2 != null) {
//			System.out.println(temp2.data + " ->" + temp2.next);
//			temp2 = temp2.next;
//		}
	}

	static Node addLL2(Node head1, Node head2) {
		head1 = reverse(head1);
		head2 = reverse(head2);
		Node temp1 = head1;
		Node temp2 = head2;
		while (temp1 != null && temp2 != null) {
			int sum = temp1.data + temp2.data;

		}
	}

	static Node reverse(Node head) {
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
