package dp_LIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Longest_IncreasingSubsequence {
	public static void main(String[] args) {
		int []nums = {10,9,2,5,3,7,101,18};
		System.out.println();
		System.out.println(lengthOfLIS(nums));
		
	}
	public static int lengthOfLIS(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(nums[0]);
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>list.get(list.size()-1)) {
				list.add(nums[i]);
			}
			else {
				int ind=Collections.binarySearch(list, nums[i]);
				if(ind<0) {
					ind=-1*ind-1;
				}
				list.set(ind, nums[i]);
			}
		}
		return list.size();
	}
}
