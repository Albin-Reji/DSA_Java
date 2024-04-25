package binary_search_2d;

import java.util.Arrays;

public class PeakElement {

	public static void main(String[] args) {
		int[][] mat = {{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};
		System.out.println(Arrays.toString(findPeakGrid(mat)));
	}
	
	public static int[] findPeakGrid(int[][] mat) {
        int m=mat[0].length;
        int n=mat.length;
        int high=m-1,low=0;
        
        while(low<=high) {
        	int mid=(low+high)/2;
        	int row=maxElement(mat, mid, n);
        	int left=mid-1>=0?mat[row][mid-1]:-1;
        	int right=mid+1<m?mat[row][mid+1]:-1;
        	if(mat[row][mid]>left&&mat[row][mid]>right)return new int[] {row, mid};
        	else if(mat[row][mid]<left)high=mid-1;
        	else low=mid+1;
        	
        }
        return new int[] {-1,-1};
        
    }	
	static int maxElement(int arr[][],int  mid, int n) {
		int row=0;
		int maxElem=Integer.MIN_VALUE;
		int index=-1;
		while(row<n) {
			if(arr[row][mid]>maxElem) {
				index=row;
				maxElem=arr[row][mid];
			}
			row++;
		}
		return index;
	}
}
