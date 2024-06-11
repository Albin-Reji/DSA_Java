package twoPte_slidingwindow;

import java.awt.geom.AffineTransform;
import java.util.Arrays;

public class LargestLocalValue {

	public static void main(String[] args) {
		int[][] matrix = {
			    {9, 9, 8, 1},
			    {5, 6, 2, 6},
			    {8, 2, 6, 4},
			    {6, 2, 2, 2}
			};
		int ans[][]=largestLocal(matrix);
		
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans.length;j++) {
				System.out.println(ans[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static int[][] largestLocal(int[][] grid) {
		int n=grid.length;
        int ans[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++) {
        	for(int j=0;j<n-2;j++) {
            	ans[i][j]=findDigit(grid, i, j);
            }
        }
        return ans;
    }
	
	
	public static int findDigit(int nums[][], int i, int j) {
		int maxElem=Integer.MIN_VALUE;
		for(int x=i;x<i+3;x++) {
			for(int y=j;y<j+3;y++) {
				maxElem=Math.max(maxElem, nums[x][y]);
			}
		}
		return maxElem;
	}

}
