package binary_search_2d;

import java.util.Arrays;

public class SearchInMatrix {
	public static void main(String[] args) {
		int arr[][]= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(Arrays.toString(findElement(arr, 7)));
	}
	
	static int[] findElement(int matrix[][], int target) {
		int col=matrix[0].length-1;
		int row=0;
		int currentPtr=-1;
		while(row<matrix.length-1&&col>=0) {
			currentPtr=matrix[row][col];
			if(currentPtr==target)return new int[] {row, col};
			else if(currentPtr<target)row=row+1;
			else col=col-1;
		}
		return new int[] {-1,-1};
	}
	
	
		
}
