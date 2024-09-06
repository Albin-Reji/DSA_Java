package dp_stocks;

import java.util.Arrays;

public class BuySell_CoolDown {
	public static void main(String[] args) {
		int []prices = {1,};
		System.out.println(maxProfit(prices));
	}
	public static  int maxProfit(int[] prices) {
		int dp[][]=new int[prices.length][2];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        return tabulation(prices);
    }
	
	static int getMaxProfit(int index, int buy, int prices[], int dp[][]) {
		
		if(index>=prices.length)return 0;
		if(dp[index][buy]!=-1)return dp[index][buy];
		int profit=0;
		if(buy==1) {
			dp[index][buy]=Math.max(-1*prices[index]+getMaxProfit(index+1, 0, prices, dp), 0+getMaxProfit(index+1, 1, prices, dp));
		}
		else {
			dp[index][buy]=Math.max(prices[index]+getMaxProfit(index+2, 1, prices, dp), 0+getMaxProfit(index+1, 0, prices, dp));

		}
		return dp[index][buy];
	}
	static int tabulation(int prices[]) {
		int dp[][]=new int[prices.length+1][3];
		for(int index=prices.length-2;index>=0;index++) {
			for(int buy=0;buy<=1;buy++) {
				if(buy==1) {
					dp[index][buy]=Math.max(-prices[index]+dp[index+1][0], dp[index+1][1]);					
				}
				else {
					dp[index][buy]=Math.max(prices[index]+dp[index+2][1], dp[index+1][0]);			
				}
			}
		}
		return dp[0][1];
	}

}
