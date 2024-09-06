package dp_subsequence;

import java.util.Arrays;

public class CoinChange_II {

	public static void main(String[] args) {
		int coins[]= {1,2,5};
		int amount=5;
		System.out.println(change(amount, coins));

	}
	public static  int change(int amount, int[] coins) {
		int dp[][]=new int[coins.length][amount+1];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        
		return findAllPssiblities(coins.length-1, coins, amount, dp);
		
    }
	static int findAllPssiblities(int index, int arr[], int target, int [][]dp) {
		if(index==0) {
			if(target%arr[index]==0) {
				return 1;
			}
			return 0;
		}
		if(dp[index][target]!=-1)return dp[index][target];
		int take=0;
		if(arr[index]<=target) {
			take=findAllPssiblities(index, arr, target-arr[index], dp);
		}
		int nottake=findAllPssiblities(index-1, arr, target, dp);
		return dp[index][target]= take+nottake;
	}

}
