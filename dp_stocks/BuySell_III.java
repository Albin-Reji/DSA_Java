package dp_stocks;

import java.util.Arrays;

public class BuySell_III {

	public static void main(String[] args) {
		int  prices[] = {1,2,3,4,5};
		System.out.println(maxProfit(prices));

	}
	public static int maxProfit(int[] prices) {
		int dp[][][]=new int[prices.length][2][3];
		for(int d[][]:dp) {
			for(int t[]:d) {
				Arrays.fill(t, -1);
			}
			
		}
        return getMax(0, 1, 2, prices, dp);
    }
	static int getMax(int index, int buy, int cap, int []prices, int dp[][][]) {
		if(index==prices.length||cap==0)return 0;
			
		if(dp[index][buy][cap]!=-1)return dp[index][buy][cap];
		int profit=0;
		
		if(buy==1) {
			dp[index][buy][cap]=Math.max(-1*prices[index]+getMax(index+1, 0, cap, prices,dp), 0+getMax(index+1, 1, cap, prices,dp));
		}
		else {
			dp[index][buy][cap]=Math.max(prices[index]+getMax(index+1, 1, cap-1, prices,dp), 0+getMax(index+1, 0, cap, prices,dp));
		}
		
		return dp[index][buy][cap];
	}
	static int getMaxProfits(int prices[]) {
		int dp[][][]=new int[prices.length+1][2][3];
		
		for(int index=prices.length-1;index>=0;index--) {
			for(int buy=0;buy<=1;buy++) {
				for(int cap=1;cap<=2;cap++) {
					if(buy==1) {
						dp[index][buy][cap]=Math.max(-1*prices[index]+dp[index-1][0][cap], dp[index-1][1][cap]);
					}
					if(buy==0) {
						dp[index][buy][cap]=Math.max(1*prices[index]+dp[index-1][1][cap], dp[index-1][0][cap]);
					}
				}
			}
		}
		return dp[0][1][2];
	}

}
