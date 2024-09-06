package dp_2d;

import java.util.Arrays;

public class NinjaTechnique {

	public static void main(String[] args) {
		int[][] arr = {
	            {2,1,3},
	            {3,4,6},
	            {10,1,6},
	            {8,3,7}
	        };
		System.out.println(maximumPoints(arr, arr.length));
	}
	public static int maximumPoints(int arr[][], int N) {
		int dp[][]=new int[N][5];
        return findMax(arr, N-1, N, dp);
    }
//	tabulation
	static int findMax(int arr[][], int index, int prevTask, int dp[][]) {
		dp[0][0]=Math.max(dp[0][1], dp[0][2]);
		dp[0][1]=Math.max(dp[0][0], dp[0][2]);
		dp[0][2]=Math.max(dp[0][0], dp[0][1]);
		dp[0][3]=Math.max(dp[0][0],Math.max( dp[0][2], dp[0][1]));
		
		for(int day=1;day<arr.length;day++) {
			for(int last=0;last<=3;last++) {
				dp[day][last]=0;
				for(int task=0;task<3;task++) {
					if(task!=last) {
						int point=arr[day][task]+dp[day-1][task];
						dp[day][last]=Math.max(dp[day][last], point);
					}
				}
			}
		}
		return dp[arr.length-1][3];
	}
//	memorization
	static int findMaxx(int arr[][], int index, int prevTask, int[][]dp) {
		if(index==0) {
			int maxi=0;
			for(int i=0;i<arr[0].length;i++) {
				if(i!=prevTask) {
					maxi=Math.max(maxi, arr[index][i]);
				}
			}
			return dp[index][prevTask]=maxi;
		}
		if(dp[index][prevTask]!=-1)return dp[index][prevTask];
		int maxi=0;
		for(int i=0;i<arr[0].length;i++ ) {
			if(i!=prevTask) {
			int	currPts=findMax(arr, index-1, i, dp)+arr[index][i];
			maxi=Math.max(maxi, currPts);
			}
		}
		return dp[index][prevTask]=maxi;
	}

}
