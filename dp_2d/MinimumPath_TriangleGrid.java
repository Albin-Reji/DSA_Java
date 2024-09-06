package dp_2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPath_TriangleGrid {

	public static void main(String[] args) {
		int[][] triangleArray = {
	            {2},
	            {3, 4},
	            {6, 5, 7},
	            {4, 1, 8, 3}
	        };

	        List<List<Integer>> triangleList = new ArrayList<>();

	        for (int i = 0; i < triangleArray.length; i++) {
	            List<Integer> row = new ArrayList<>();
	            for (int j = 0; j < triangleArray[i].length; j++) {
	                row.add(triangleArray[i][j]);
	            }
	            triangleList.add(row);
	        }

	        System.out.println(minimumTotal(triangleList));

	}
	public static int minimumTotal(List<List<Integer>> triangle) {
		int dp[][]=new int[triangle.size()][triangle.size()];
		for(int[] arr:dp) {
			Arrays.fill(arr, -1);
		}
		return findMinPath(triangle, 0, 0, dp);
        
    }
	static int findMinPath(List<List<Integer>> triangle,int row, int col, int[][] dp) {
		if(row==triangle.size()-1&& col<triangle.get(row).size()) {
			return triangle.get(row).get(col);
		}
		if(dp[row][col]!=-1)return dp[row][col];
		int right=Integer.MAX_VALUE;
		int down=Integer.MAX_VALUE;
		if(row+1<=triangle.size()) {
			down=findMinPath(triangle, row+1, col, dp)+triangle.get(row).get(col);
		}
		if(col+1<=triangle.get(row).size()) {
			right=findMinPath(triangle, row+1, col+1, dp)+triangle.get(row).get(col);
		}
		return dp[row][col]=Math.min(right, down);
	}

}
