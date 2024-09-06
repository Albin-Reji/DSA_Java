package dp_partition;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[] arr = {40, 20, 30, 10, 30};
		System.out.println(matrixMultiplication(arr.length, arr));
	}
	static int matrixMultiplication(int N, int arr[])
    {
		int dp[][]=new int[N][N];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        return getPartitionSum(1, N-1, arr, dp);
    }
	static int getPartitionSum(int i, int j, int arr[], int dp[][]) {
		if(i==j)return 0;
		if(dp[i][j]!=-1)return dp[i][j];
		int  minSteps=Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
			int steps=arr[i-1]*arr[k]*arr[j]+getPartitionSum(i, k, arr, dp)+getPartitionSum(k+1, j, arr, dp);
			minSteps=Math.min(minSteps, steps);
		}
		return dp[i][j]=minSteps;
	}

}
