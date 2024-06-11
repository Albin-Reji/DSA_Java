package twoPte_slidingwindow;

import java.util.HashMap;

public class MaxConcequtive_III {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int k = 3;
		System.out.println(findMaxFruits(nums, nums.length));

	}

	public static int findMaxFruits(int[] arr, int n) {

		int left = 0;
		int right = 0;
		int maxLen = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		while (right < n) {

			if (map.containsKey(arr[right])) {
				int cnt = map.get(arr[right]);
				map.put(arr[right], cnt + 1);
			} else {
				map.put(arr[right], 1);
			}
			if (map.size() <= 2) {
				int len = right - left + 1;
				maxLen = Math.max(len, maxLen);
			} else {
				while (map.size() > 2) {
					map.put(arr[left], map.get(arr[left]) - 1);
					if (map.get(arr[left]) == 0) {
						map.remove(arr[left]);
					}
					left++;
				}
			}

			right++;
		}
		return maxLen;

	}

}
