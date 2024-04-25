package binary_search_2d;

import java.util.Arrays;

public class Median_of_Matrix {

	public static void main(String[] args) {
		
		int[][] mat = {
	            {1, 5, 7, 9, 11},
	            {2, 3, 4, 8, 9},
	            {4, 11, 14, 19, 20},
	            {6, 10, 22, 99, 100},
	            {7, 15, 17, 24, 28}
	        };
		System.out.println(findMedian(mat, mat.length, mat[0].length));
		
	}
	public static int findMedian(int matrix[][], int m, int n) {
		int arr[]=new int[n*m];
		int index=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				arr[index]=matrix[i][j];
				index++;
			}
		}
		Arrays.sort(arr);
		
            
        return arr[(int)(m*n)/2];
        
    }
}
