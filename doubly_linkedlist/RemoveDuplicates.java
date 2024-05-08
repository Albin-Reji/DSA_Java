package doubly_linkedlist;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Doubly_LinkedList d = new Doubly_LinkedList();
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 9, 9, 9 };
		Node head = d.arrToLL(arr);
		Node temp = removeDuplicates(head);
		while (temp != null) {
			System.out.println(temp.back + " <-" + temp.data + " ->" + temp.next);
			temp = temp.next;
		}

	}

	static Node removeDuplicates(Node head) {
		Node temp = head;
		Node newNode = temp.next;
		while (temp != null && temp.next != null) {

			while (newNode != null && temp.data == newNode.data) {
				newNode = newNode.next;
			}

			temp.next = newNode;
			if (newNode != null) {
				newNode.back = temp;
			}

			temp = temp.next;
		}
		return head;
	}

}
