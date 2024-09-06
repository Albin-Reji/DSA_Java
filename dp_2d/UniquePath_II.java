package dp_2d;

import java.util.Arrays;

public class UniquePath_II {

	public static void main(String[] args) {
		int[][] obstacleGrid = {
			    {0, 0, 0},
			    {0, 1, 0},
			    {0, 0, 0}
			};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));

	}
	public static  int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid[0][0]==1)return 0;
		if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)return 0;
		int dp[][]=new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
		for(int[] arr:dp) {
			Arrays.fill(arr, -1);
		}
        return findPath(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1, dp);
    }
	static int findPath(int grid[][], int row, int col,int dp[][]) {
		if(row==0&&col==0)return 1;
		if(row<0||col<0)return 0;
		if(dp[row][col]!=-1)return dp[row][col];
		if(row>=0&&col>=0&&grid[row][col]==1)return 0;
		int up=findPath(grid, row-1, col, dp);
		int left=findPath(grid, row, col-1, dp);
		return dp[row][col]=up+left;
	}

}
