package linkedlist_dsa;

public class Length_Of_LL {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 3, 2, 0, -4 };
		Node head = d.arrToLL(arr);

		head.next.next.next.next = head.next;
		head = head.next;
		Node temp = head;
		System.out.println(findLength_LLLoop(temp));
//		while (temp != null) {
//			System.out.println(temp.data + " ->" + temp.next);
//			temp = temp.next;
//		}

	}

	public static int findLength_LLLoop(Node head) {
		Node temp = head;
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				int cnt = 1;
				while (fast != slow) {
					cnt++;
					fast = fast.next;
				}
				return cnt;
			}
		}
		return 0;
	}

	public static int findlength(Node slow, Node fast) {
		int cnt = 1;
		while (fast != slow) {
			cnt++;
			fast = fast.next;
		}
		return cnt;
	}

}
