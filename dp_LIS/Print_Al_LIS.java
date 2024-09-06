package dp_LIS;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Print_Al_LIS {

	public static void main(String[] args) {
		int nums[]= {5,4,11,1,16,8};
		printAllLIS(nums);
	}
	static int printLIS(int nums[]) {
		return 0;
	}
	static void printAllLIS(int nums[]){
		int dp[]=new int[nums.length];
		int hash[]=new int[nums.length];
		int max=0;
		int lastind=0;
		Arrays.fill(dp, 1);
		for(int ind=0;ind<nums.length;ind++) {
			hash[ind]=ind;
			for(int prev=0;prev<ind;prev++) {
				if(nums[prev]<nums[ind]&&dp[prev]+1>dp[ind]) {

					dp[ind]=dp[prev]+1;
					hash[ind]=prev;
				}
					
			}
			if(dp[ind]>max) {
				max=dp[ind];
				lastind=ind;
			}
		}

		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(nums[lastind]);
		while(hash[lastind]!=lastind) {
			lastind=hash[lastind];
			arr.add(nums[lastind]);
		}
		Collections.reverse(arr);
		System.out.println(arr);

	}

}
