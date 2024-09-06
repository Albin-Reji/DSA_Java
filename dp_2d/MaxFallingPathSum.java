package dp_2d;

import java.util.Arrays;

public class MaxFallingPathSum {

	public static void main(String[] args) {
		int[][] matrixArray = {
	            {2, 1, 3},
	            {6, 5, 4},
	            {7, 8, 9}
	        };
		System.out.println(minFallingPathSum(matrixArray));

	}
	public static  int minFallingPathSum(int[][] matrix) {
		int dp[][]=new int [matrix.length][matrix[0].length];
		return Maxpath(matrix, dp);
		
    }
	static int Maxpath(int [][] matrix, int[][] dp) {
		int n=matrix.length;
		for(int i=0;i<matrix[0].length;i++) {
			dp[n-1][i]=matrix[n-1][i];
		}
		
		for(int row=n-2;row>=0;row--) {
			for(int col=0;col<matrix[0].length;col++) {
				int left=Integer.MAX_VALUE;
				int right=Integer.MAX_VALUE;
				
				int up=matrix[row][col]+dp[row+1][col];
				
				if(col<matrix[0].length-1) {
					left=matrix[row][col]+dp[row+1][col+1];
				}
				if(col>0) {
					right=matrix[row][col]+dp[row+1][col-1];
				}
				dp[row][col]=Math.min(up, Math.min(left, right));
			}
		}
		int minVal=Integer.MAX_VALUE;
		for(int i=0;i<matrix[0].length;i++) {
			minVal=Math.min(minVal, dp[0][i]);
		}
		return minVal;
		
	}
		
	
	
	
	
//	memorization
	
	static int maxPathSum(int [][]matrix, int row, int col, int[][] dp) {
		if(row==matrix.length-1) {
			return matrix[row][col];
		}
		if(dp[row][col]!=-1)return dp[row][col];
		int left=Integer.MAX_VALUE;
		int down=Integer.MAX_VALUE;
		int right=Integer.MAX_VALUE;
		if(col>0&&row<matrix.length) {
			left=maxPathSum(matrix, row+1, col-1, dp)+matrix[row][col];
		}
		if(row<matrix.length) {
			down=maxPathSum(matrix, row+1, col, dp)+matrix[row][col];
		}
		if(col<matrix[0].length-1&&row<matrix.length) {
			right=maxPathSum(matrix, row+1, col+1, dp)+matrix[row][col];
		}
		return dp[row][col]=Math.min(down, Math.min(left, right));
	}

}
