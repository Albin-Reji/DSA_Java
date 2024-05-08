package bit_manupulation;

import java.util.Arrays;
import java.util.HashMap;

public class Xor_N {

	public static void main(String[] args) {
		String s = "aa";
		int[] nums = { 1, 2, 2, 3 };
		System.out.println(isMonotonic(nums));

	}

	public static boolean isMonotonic(int[] nums) {
		boolean decreasing = true;
		boolean increasing = true;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				increasing = false;
			}
			if (nums[i] > nums[i - 1]) {
				decreasing = false;
			}
			System.out.println("increasing : " + increasing + " decreasing: " + decreasing);
		}
		return decreasing || increasing;
	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int maxSum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				int currMinElem1 = Math.min(nums[i], nums[j]);
				int currMinElem2 = Math.min(nums[j + 1], nums[j + 2]);
				int sum = currMinElem1 + currMinElem2;
				maxSum = sum > maxSum ? sum : maxSum;
			}
		}
		return maxSum;
	}

	static boolean isSubstringPresent(String s) {
		StringBuilder str = new StringBuilder(s);
		str.reverse().toString();
		System.out.println("string:  " + s);
		System.out.println("reverse:  " + str.toString());

		if (s.length() == 1)
			return false;

		for (int i = 0; i < s.length() - 1; i++) {
			System.out.println(s.substring(i, i + 2));
			System.out.println(str.toString().contains(s.substring(i, i + 2)));
			return true;
		}

		return false;
	}

	public static int[] singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				int cnt = map.get(nums[i]);
				map.put(nums[i], cnt + 1);
			}
		}
		int i = 0;
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				arr[i++] = key;
			}
		}
		return arr;

	}

	public static int returnXor(int n) {
		if (n % 4 == 1)
			return 1;
		else if (n % 4 == 2)
			return n + 1;
		else if (n % 4 == 3)
			return 0;
		else
			return 0;

	}

}
