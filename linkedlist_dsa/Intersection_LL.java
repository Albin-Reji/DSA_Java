package linkedlist_dsa;

public class Intersection_LL {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr1[] = { 4, 1, 8, 4, 5, 6, 7, 8, 9 };
		int arr2[] = { 5, 6, 1, 8, 4, 5 };
		Node head1 = d.arrToLL(arr1);
		Node head2 = d.arrToLL(arr2);
//		reverseLL_II(head, 1, 1);
		Node temp1 = head1;

		while (temp1 != null) {
			System.out.println(temp1.data + " ->" + temp1.next);
			temp1 = temp1.next;
		}
		Node temp2 = head2;

		while (temp2 != null) {
			System.out.println(temp2.data + " ->" + temp2.next);
			temp2 = temp2.next;
		}
		System.out.println(
				"__________________________________________________________________________________________________");
		Node temp = getIntersectionNode(head1, head2);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	public static Node getIntersectionNode(Node headA, Node headB) {
		if (headA == null || headB == null)
			return null;

		Node a = headA;
		Node b = headB;

		// if a & b have different len, then we will stop the loop after second
		// iteration
		while (a != b) {
			// for the end of first iteration, we just reset the pointer to the head of
			// another linkedlist
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}
		return a;

	}

}
