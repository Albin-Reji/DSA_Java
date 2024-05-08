package linkedlist_dsa;

import java.util.HashMap;

public class Starting_Point_Of_Loop {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 1, 2, 3, 4 };
		Node head = d.arrToLL(arr);
		head.next.next.next.next = head.next;
		head = head.next;
		Node temp = findLoopNode(head);

//		while (temp != null) {
//			System.out.println(temp.data + " ->" + temp.next);
//			temp = temp.next;
//		}
		System.out.println(findLoopNodes(head));

	}

	static Node findLoopNode(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				slow = head;
				while (fast != slow) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}

	static int findLoopNodes(Node head) {
		int pos = 0;
		if (head.next == null)
			return pos;
		Node temp = head;
		HashMap<Node, Integer> map = new HashMap<>();
		while (temp != null) {
			if (!map.containsKey(temp)) {
				pos += 1;
				map.put(temp, pos);
				temp = temp.next;
			} else {
				return map.get(temp);
			}
		}
		return pos;
	}

}
