package twoPte_slidingwindow;

import java.util.Arrays;

public class SlidingWindow {

	public static void main(String[] args) {
		int nums[] = { 3, 4, -1 };
		isSorted(nums);
		System.out.println(sortArr(nums));

	}

	static void isSorted(int nums[]) {
		int[] sortnums = Arrays.copyOf(nums, nums.length);
		Arrays.sort(nums);
		System.out.println(Arrays.equals(nums, sortnums));
	}

	static int sortArr(int nums[]) {
		int i = 0;
		int cnt = 0;

		for (int k = 0; k < nums.length - 1; k++) {
			int j = k + 1;
			if (nums[k] < nums[k]) {
				cnt++;
			}
		}

		return cnt;
	}

}
