package DP_Easy;

import java.lang.module.FindException;
import java.util.Arrays;

public class FrogJump {

	public static void main(String[] args) {
		int[]height = {10, 20, 30 ,10};
		System.out.println(minimumEnergy(height, height.length));
	}
	public static int minimumEnergy(int arr[],int N){
		int dp[]=new int[N+1];
		Arrays.fill(dp, -1);
        return dindmin(arr, N, dp);
    }
	static int  findMin(int arr[], int index ,int dp[]) {
		if(index==0) {
			return 0;
		}
		if(dp[index]!=-1)return dp[index];
		int left=findMin(arr, index-1, dp)+ Math.abs(arr[index]-arr[index-1]);
		if(index>1) {
			int right=findMin(arr, index-2, dp)+Math.abs(arr[index]-arr[index-2]);
			return dp[index]=Math.min(left, right);
		}
		return dp[index]=Math.min(left, Integer.MAX_VALUE);
		
	}
	static int dindmin(int arr[], int n, int[] dp) {
		dp[0]=0;
		int right=Integer.MAX_VALUE;
		for(int i=1;i<n;i++) {
			int left=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
			if(i>1) {
				right=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
			}
			dp[i]=Math.min(right, left);
		}
		return dp[n-1];
	}
	

}
