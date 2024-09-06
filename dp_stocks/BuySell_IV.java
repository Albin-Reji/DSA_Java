package dp_stocks;

import java.util.Arrays;

public class BuySell_IV {

	public static void main(String[] args) {
		int k = 2;
		int []prices = {2,4,1};
		System.out.println(maxProfit(k, prices));
	}
	public static int maxProfit(int k, int[] prices) {
		int dp[][][]=new int[prices.length][2][k+1];
		for(int t[][]:dp) {
			for(int d[]:t) {
				Arrays.fill(d, -1);	
			}
		}
		
        return getMaxProfit(0, 1, k, prices, dp);
    }
	static int getMaxProfit(int index, int  buy, int k, int []prices, int[][][] dp) {
		if(index==prices.length||k==0) return 0;
		if(dp[index][buy][k]!=-1)return dp[index][buy][k];
		int profit=0;
		
		if(buy==1) {
			dp[index][buy][k]=Math.max(-1*prices[index]+getMaxProfit(index+1, 0, k, prices, dp), 0+getMaxProfit(index+1, 1, k, prices, dp));
		}
		else {
			dp[index][buy][k]=Math.max(prices[index]+getMaxProfit(index+1, 1, k-1, prices, dp), 0+getMaxProfit(index+1, 0, k, prices, dp));
		}
		return dp[index][buy][k];
		
	}

}
