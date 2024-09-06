package dp_2d;

import java.util.Arrays;

public class MinimumPathSum {

	public static void main(String[] args) {
		int[][] grid = {
			    {1, 3, 1},
			    {1, 5, 1},
			    {4, 2, 1}
			};
		System.out.println(minPathSum(grid));

	}
	public static  int minPathSum(int[][] grid) {
		int dp[][]=new int[grid.length][grid[0].length];
		for(int[] arr:dp) {
			Arrays.fill(arr, -1);
		}
        return findMinPath(grid, grid.length-1, grid[0].length-1, dp);
    }
//	tabulation
	static int findMinimumPathSum(int grid[][], int row, int col) {
		int dp[][]=new int[grid.length][grid[0].length];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(i==0&& j==0) {
					dp[i][j]=grid[i][j];
				}
				else {	
					int up=Integer.MAX_VALUE;
					int right=Integer.MAX_VALUE;
					if(i>0) {
						up+=grid[i][j]+dp[i-1][j];
					}
					if(j>0) {
						right+=grid[i][j]+dp[i][j-1];
					}
					dp[i][j]=Math.min(right, up);	
						
				}
				
			}
		}
		return dp[grid.length-1][grid[0].length-1];
	}
//	memorization
	static int findMinPath(int grid[][], int row, int col, int[][]dp) {
		if(row==0&&col==0)return grid[row][col];
		if(dp[row][col]!=-1)return dp[row][col];
		int up=Integer.MAX_VALUE;
		int left=Integer.MAX_VALUE;
		if(row-1>=0) {
			up=findMinPath(grid, row-1, col, dp)+grid[row][col];
		}
		if(col-1>=0) {
			left=findMinPath(grid, row, col-1, dp)+grid[row][col];
		}
		
		return dp[row][col]=Math.min(up, left);
	}

}
