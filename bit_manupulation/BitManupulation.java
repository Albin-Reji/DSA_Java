package bit_manupulation;

import java.util.ArrayList;

public class BitManupulation {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		int num = 7;
		int k = 1;
//		int ans = num >> k;
//		System.out.println(convertToBinary(num) + " " + convertToBinary(num & 1) + "    " + convertToBinary(ans));
////		System.out.println(convertToBinary(num) + " & " + convertToBinary(num - 1));
//		System.out.println(convertToBinary(1));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		int i = 0;
		while (num != 0) {
			ArrayList<Integer> temp = new ArrayList<>();
			if ((num & 1) == 1) {
				temp.add(nums[i]);
			} else {
				System.out.println("0");
			}
			i++;
			num = num >> 1;
			arr.add(temp);

		}

		System.out.println(arr);
	}

	static String convertToBinary(int x) {
		StringBuilder ans = new StringBuilder();
		while (x != 1) {
			ans.append(x % 2);
			x = x / 2;
		}
		ans.append(x);
		return ans.reverse().toString();
	}

	static int converttoDecimal(String s) {
		int sum = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int digit = s.charAt(i) - '0';
			sum += digit * Math.pow(2, s.length() - 1 - i);
		}
		return sum;
	}

}
