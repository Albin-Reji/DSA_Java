package dp_stocks;

import java.util.Arrays;

public class BestTime_to_BuySell {
	public static void main(String[] args) {
		int []prices = {1,3,2,8,4,9};
		int fee = 2;
		System.out.println(maxProfit(prices, fee));
	}
	public static int maxProfit(int[] prices, int fee) {
		int dp[][]=new int[prices.length][2];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        return getMaxProfit(0, 1, prices, fee, dp);
    }
	static int getMaxProfit(int index, int buy, int[] prices, int fee, int dp[][]) {
		if(index==prices.length)return 0;
		if(dp[index][buy]!=-1)return dp[index][buy];
//		int profit=0;
		if(buy==1) {
			dp[index][buy]=Math.max(-1*prices[index]+getMaxProfit(index+1, 0, prices, fee, dp), 0+getMaxProfit(index+1, 1, prices, fee, dp));
		}
		else {
			dp[index][buy]=Math.max(prices[index]+getMaxProfit(index+1, 1, prices, fee, dp)-fee, 0+getMaxProfit(index+1, 0, prices, fee, dp));
		}
		return dp[index][buy];
	}
	static int tabulation(int prices[], int fee) {
		int dp[][]=new int[prices.length+1][3];
		for(int index=prices.length-1;index>=0;index--) {
			for(int buy=0;buy<=1;buy++) {
				if(buy==1) {
					dp[index][buy]=Math.max(-1*prices[index]+dp[index+1][0], 0+dp[index+1][1]);
				}
				else{
					dp[index][buy]=Math.max(prices[index]+dp[index+1][1]-fee, 0+dp[index+1][0]);
				}
			}
		}
		return dp[0][1];
	}
	
	
	
}
