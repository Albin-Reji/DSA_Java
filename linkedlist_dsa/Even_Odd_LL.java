package linkedlist_dsa;

public class Even_Odd_LL {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();
		Node head = d.arrToLL(arr);
		Node temp = oddEven_LL(head);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node oddEven_LL(Node head) {

		Node temp = head;
		Node odd = temp;
		Node even = temp.next;
		Node even_C = temp.next;

		while (odd.next != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;

			even = even.next;

		}

		odd.next = even_C;
		return head;
	}

}
