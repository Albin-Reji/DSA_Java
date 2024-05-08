package bit_manupulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode {

	public static void main(String[] args) {

		int nums[] = { -3, -1, -9, -3, 5, 6, 10, -22, -12 };
		int target = -2;
		threeSumClosest(nums, target);

//		List<List<Integer>> ans = threeSum(nums);
//		System.out.println(ans);

	}

	public static void threeSumClosest(int[] nums, int target) {
		int closeVal = 0;
		for (int i = 0; i < nums.length; i++) {
			if (Math.abs(nums[i] - target) < Math.abs(target - closeVal)) {
				closeVal = nums[i];
			}
		}
		System.out.println(closeVal);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int j = 0;
		int k = nums.length - 1;
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i != 0 && nums[i] == nums[i - 1])
				continue;
			j = i + 1;
			k = nums.length - 1;
			while (j < k) {
				if (nums[i] + nums[j] + nums[k] == 0) {
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					ans.add(temp);
					j++;
					k--;
					while (j < k && nums[j] == nums[j - 1])
						j++;
					while (j < k && nums[k] == nums[k + 1])
						k--;

				} else if (nums[i] + nums[j] + nums[k] > 0) {
					k--;
				} else {
					j++;
				}

			}
		}
		return ans;

	}

	public static void findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		Set<Integer> countSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if ((Arrays.binarySearch(nums, i + 1, nums.length, Math.abs(nums[i] + k))) > 0) {
				countSet.add(nums[i]);
			}
		}
		for (int i : countSet) {
			System.out.println(i);
		}
	}

}
