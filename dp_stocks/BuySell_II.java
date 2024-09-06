package dp_stocks;

import java.util.Arrays;

public class BuySell_II {

	public static void main(String[] args) {
		int []prices = {7,1,5,3,6,4};
		System.out.println(buysell(prices));
	}
	public static int maxProfit(int[] prices) {
		int dp[][]=new int[prices.length][2];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
       return (int)findMax(0, 1, prices, dp); 
    }
	static int findMax(int index ,int buy, int []prices, int[][] dp) {
		if(index==prices.length) {
			return 0;
		}
		if(dp[index][buy]!=-1)return dp[index][buy];
		if(buy==1) {
			dp[index][buy]=Math.max(-1*prices[index]+findMax(index+1, 0, prices, dp), 0+findMax(index+1, 1, prices, dp));
		}
		else {
			dp[index][buy]=Math.max(prices[index]+findMax(index+1, 1, prices, dp), 0+findMax(index+1, 0, prices, dp));
		}
		return dp[index][buy];
	}
//	tabulation
	
	static int buysell(int prices[]) {
		int dp[][]=new int [prices.length+1][2];
		for(int index=prices.length-1;index>=0;index--) {
			for(int buy=0;buy<2;buy++) {
				if(buy==1) {
					dp[index][buy]=Math.max(-1*prices[index]+dp[index+1][0], dp[index+1][1]);
				}
				else {
					dp[index][buy]=Math.max(prices[index]+dp[index+1][1], 0+dp[index+1][0]);
				}
			}
		}
		return dp[0][1];
	}
	

}
