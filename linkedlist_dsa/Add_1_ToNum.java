package linkedlist_dsa;

public class Add_1_ToNum {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 9, 9 };
		Node head = d.arrToLL(arr);
//		addOne(head);
		Node temp = addOne(head);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node addOne(Node head) {

		Node revNode = reverse(head);
		Node temp = revNode;
		int carry = 1;
		int sum = 0;
		while (temp.next != null) {
			sum = temp.data + carry;
			temp.data = sum % 10;
			carry = sum / 10;
			temp = temp.next;
		}
		sum = temp.data + carry;
		temp.data = sum % 10;
		carry = sum / 10;
		if (carry != 0) {
			Node newNode = new Node(carry);
			temp.next = newNode;
			newNode.next = null;
		}
		return reverse(revNode);
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
