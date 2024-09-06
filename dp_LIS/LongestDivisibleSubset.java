package dp_LIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestDivisibleSubset {

	public static void main(String[] args) {
		int[]  nums = {1,2,4,8};
		System.out.println(largestDivisibleSubset(nums));
	}
	public static List<Integer> largestDivisibleSubset(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
		int dp[]=new int[nums.length];
		int last=0;
		int hash[]=new int[nums.length];
		int maxi=0;
		for(int i=0;i<nums.length;i++) {
			hash[i]=i;
			for(int j=0;j<i;j++) {
				if(nums[i]%nums[j]==0&&dp[j]+1>dp[i]) {
					dp[i]=dp[j]+1;
					hash[i]=j;
				}
			}
			if(dp[i]>maxi) {
				maxi=dp[i];
				last=i;
			}
		}
		while(last!=0) {
			list.add(nums[last]);
			last=hash[last];
		}
		list.add(nums[0]);
		Collections.reverse(list);
		return list;
	}
}
