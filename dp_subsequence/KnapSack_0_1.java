package dp_subsequence;

import java.util.Arrays;

public class KnapSack_0_1 {

	public static void main(String[] args) {
		int weight[]= {1, 3, 4, 5};
		int value[]= {6, 1, 7, 7};
		System.out.println(robMaximum(weight, value, 8));

	}
	static int robMaximum(int weight[], int value[], int bagWeight) {
		int dp[][]=new int[weight.length][bagWeight+1];
        for(int []d:dp) {
        	Arrays.fill(d, -1);
        }
		return returnMaxItem(weight.length-1, weight, value, bagWeight, dp);
	}
	static int returnMaxItem(int index,int weight[] ,int value[], int bagWeight , int[][] dp) {
		if(index==0) {
			if(bagWeight>=weight[index])return (bagWeight/weight[index])*value[index];
			return 0;
		}
		if(dp[index][bagWeight]!=-1) return dp[index][bagWeight];
		int take=0;
		if(bagWeight>=weight[index]) {
			take=value[index]+returnMaxItem(index, weight, value, bagWeight-weight[index], dp);
		}
		int nottake=0+returnMaxItem(index-1, weight, value, bagWeight, dp);
		return dp[index][bagWeight]=Math.max(nottake, take);
	}

}
