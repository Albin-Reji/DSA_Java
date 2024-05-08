package doubly_linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Sum_DLL {

	public static void main(String[] args) {
		Doubly_LinkedList d = new Doubly_LinkedList();
		int[] arr = { 1, 2, 3, 4, 9 };
		Node head = d.arrToLL(arr);
		List<List<Integer>> ans = findPair(head, 5);
		for (List<Integer> l : ans) {
			System.out.print("[");
			for (Integer i : l) {
				System.out.print(i + ",");
			}
			System.out.print("]\n");

		}
//		Node temp = head;
//		while (temp != null) {
//			System.out.println(temp.back + " <-" + temp.data + " ->" + temp.next);
//			temp = temp.next;
//		}

	}

	public static List<List<Integer>> findPair(Node head, int k) {
		Node temp = head;
		Node i = head;
		Node j = head;
		List<List<Integer>> ds = new ArrayList<>();
		boolean isTrue = false;
		while (temp != null) {

			j = temp;
			temp = temp.next;
		}
		while (i.data < j.data) {
			int sum = i.data + j.data;
			if (sum == k) {
				List<Integer> list1 = new ArrayList<>();
				list1.add(i.data);
				list1.add(j.data);
				isTrue = true;
				i = i.next;
				j = j.prev;
				ds.add(list1);
			} else if (sum < k) {
				i = i.next;
			} else {
				j = j.prev;
			}
		}
		return ds;
	}

}
