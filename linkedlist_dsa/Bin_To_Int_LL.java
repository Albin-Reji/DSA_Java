package linkedlist_dsa;

import java.util.ArrayList;

public class Bin_To_Int_LL {

	public static void main(String[] args) {
		Dutch_Nationl_FlagLL d = new Dutch_Nationl_FlagLL();
		int arr[] = { 1, 0, 1, 1 };
		Node head = d.arrToLL(arr);
		Node temp = head;

//		while (temp != null) {
//			System.out.println(temp.data + " ->" + temp.next);
//			temp = temp.next;
//		}
//		System.out.println("SUM: " + binToInt(head));
		System.out.println(findLatestTime("0?:5?"));

	}

	static int binToInt1(Node head) {
		ArrayList<Integer> arr = new ArrayList<>();
		int cnt = 0;
		Node temp = head;
		while (temp != null) {
			cnt++;
			arr.add(temp.data);
			temp = temp.next;
		}
		int sum = 0;
		int j = cnt;
		for (int i = 0; i < j; i++) {
			sum += (int) Math.pow(2, i) * arr.get(cnt - 1);
			cnt = cnt - 1;
		}
		return sum;

	}

	static int binToInt(Node head) {
		int d = 0;
		while (head != null) {
			d = d * 2 + head.data;
			head = head.next;
		}
		return d;
	}

	static String findLatestTime(String s) {
//		"1?:?4"
		boolean isNotPass = true;
		String ans = "";
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ':') {
				isNotPass = false;
				k = i;
			}
			if (isNotPass) {
				if (s.charAt(i) == '?') {
					ans += "1";
				} else {
					ans += s.charAt(i);
				}
			} else {
				if (s.charAt(i) == '?') {
					if (i - k == 1) {
						ans += "5";
					} else {
						ans += "9";
					}
				} else {
					ans += s.charAt(i);
				}
			}
		}
		return ans;
	}

}
