package dp_subsequence;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		System.out.println(10e9);

	}
	public static int coinChange(int[] coins, int amount) {
	         if(coins.length==1){
	            if(amount%coins[0]==0)return amount/coins[0];
	            return -1;
	        }
	        int dp[][]=new int[coins.length][amount+1];
	        for(int []d:dp) {
	        	Arrays.fill(d, -1);
	        }
			return findAllCoinPossiblities(coins.length-1, coins, amount, dp);
			
	    }
	
	static int findAllCoinPossiblities(int index, int[] coins, int target, int[][]dp) {
        
		if(index==0) {
			if(target%coins[index]==0)return target/coins[index];
			return (int) Math.pow(10, 9);
		}
		if(dp[index][target]!=-1)return dp[index][target];
		int nottake=0+findAllCoinPossiblities(index-1, coins, target, dp);
		int take=(int) Math.pow(10, 9);
		if(coins[index]<=target) {
			take=1+findAllCoinPossiblities(index, coins, target-coins[index], dp);
		}
		
		return dp[index][target]=Math.min(take, nottake);
	}

}
