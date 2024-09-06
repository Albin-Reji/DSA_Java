package dp_2d;

import java.util.Arrays;

public class UniquePath {

	public static void main(String[] args) {
		
		System.out.println(uniquePaths(3, 7));
	}
	public static int uniquePaths(int m, int n) {
        return findAllPath(m-1, n-1, m,n);
    }
	static int findAllPath(int row, int col, int m, int n) {
		int dp[][] =new int [m+1][n+1];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				dp[0][0]=1;
				int left=0;
				int right=0;
				if(j>0) {
					left=dp[i][j-1];
				}
				if(i>0) {
					right=dp[i-1][j];
				}
				dp[i][j]=left+right;
			}
		}
		return dp[m-1][n-1];
	}

//	recursive solution
	static int findAllPathsRecursion( int row, int col, int[][] dp) {
		if(row==0&&col==0)return 1;
		if(row<0||col<0)return 0;
		if(dp[row][col]!=-1)return dp[row][col];
		int up=findAllPath(row-1, col, dp);
		int left=findAllPath(row, col-1, dp);
		return dp[row][col]=up+left;
	}
	

}
