package twoPte_slidingwindow;

import java.util.Arrays;

public class FLipSum {

	public static void main(String[] args) {
		int[][] grid = {
			    {0, 0, 1, 1},
			    {1, 0, 1, 0},
			    {1, 1, 0, 0}
			};
//		int ans[][]=matrixScore(grid);
//		
//		for(int i=0;i<grid.length;i++) {
//			System.out.print("[");
//			for(int j=0;j<grid[0].length;j++) {
//				System.out.print(grid[i][j]+" ");
//			}
//			System.out.println("]"+"\n");
//		}
		System.out.println(matrixScore(grid));

	}
	public static int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++) {
        	if(grid[i][0]==0) {
        		for(int j=0;j<m;j++) {
        			grid[i][j]^=1;
        		}
        	}
        }
        for(int j=1;j<m;j++) {
        	int colCnt=0;
        	for(int i=0;i<n;i++) {
        		colCnt+=grid[i][j];
        	}
        	if(colCnt<n-colCnt) {
        		for(int i=0;i<n;i++) {
        			grid[i][j]^=1;
        		}
        	}
        }
        int ans=0;
        for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ans+=grid[i][j]*(1<<m-1-j);
			}
        }
        
        return ans;
    }

}
