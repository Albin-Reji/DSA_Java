package DP_Easy;import java.time.chrono.MinguoChronology;
import java.util.Arrays;

public class FrogJump_KSteps {

	public static void main(String[] args) {
		 int k = 1;
		 int arr[]= {10, 20, 10};
		 System.out.println(minimizeCost(arr, k));

	}
	public static int minimizeCost(int arr[], int k) {
		int dp[]=new int[arr.length+1];
		Arrays.fill(dp, -1);
		dp[0]=0;
        return findMin(arr, arr.length-1, k, Integer.MAX_VALUE, dp);
    }
	static int findMin(int arr[], int index, int k, int minValue, int dp[]) {
		if(index==0) {
			return 0;
		}
		if(dp[index]!=-1)return dp[index];
		int temp=Integer.MAX_VALUE;
		for(int i=1;i<=k&&index-i>=0;i++) {
			
			temp=findMin(arr, index-i, k, minValue, dp)+Math.abs(arr[index]-arr[index-i]);
			minValue=Math.min(minValue, temp);
		}
		return dp[index]=minValue;
	}
}
