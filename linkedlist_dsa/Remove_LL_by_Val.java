package linkedlist_dsa;

public class Remove_LL_by_Val {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		Node head = d.arrToLL(arr);
		Node temp = remove_byVal(head, 6);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node remove_byVal(Node head, int val) {
		if (head == null) {
			return head;
		}
		while (head != null && head.data == val) {
			head = head.next;
			if (head == null)
				return null;
		}
		Node temp = head;
		while (temp.next != null) {
			if (temp.next.data == val) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

}
