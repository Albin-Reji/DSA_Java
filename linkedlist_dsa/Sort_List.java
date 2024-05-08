package linkedlist_dsa;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_List {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();

		int arr[] = { 5, 1, 6, 2, 9, 11, 3, 4 };
		Node head = d.arrToLL(arr);
		Node temp = sortLL(head);

		while (temp != null) {
			System.out.println(temp.data + " ->" + temp.next);
			temp = temp.next;
		}
	}

	static Node sortLL(Node head) {
		Node temp = head;
		ArrayList<Integer> arr = new ArrayList<>();
		while (temp != null) {
			arr.add(temp.data);
			temp = temp.next;
		}
		Collections.sort(arr);
		temp = head;
		int i = 0;
		while (temp != null) {
			temp.data = arr.get(i);
			i++;
			temp = temp.next;
		}
		return head;
	}

}
