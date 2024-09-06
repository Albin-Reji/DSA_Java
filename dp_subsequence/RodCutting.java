package dp_subsequence;

import java.util.Arrays;

public class RodCutting {
	public static void main(String[] args) {
		int Price[] = {1, 5, 8, 9, 10, 17, 17, 20};
		System.out.println(cutRod(Price, 8));
	}
	public static  int cutRod(int price[], int n) {
		int dp[][]=new int[price.length][n+1];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
	    return maxProfitRod(n-1, price, n, dp);
	}
	static int maxProfitRod(int index, int price[], int rod, int[][] dp) {
		if(index==0) {
			if(rod>=index+1) return rod*price[index];
			return 0;
		}
		if(dp[index][rod]!=-1)return dp[index][rod];
		int take=Integer.MIN_VALUE;
		if(rod>=index+1) {
			take=price[index]+maxProfitRod(index, price, rod-(index+1), dp);
		}
		int nottake=0+maxProfitRod(index-1, price, rod, dp);
		return dp[index][rod]=Math.max(take, nottake);
	}
}

