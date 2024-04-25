package binary_search_2d;
import java.util.Arrays;
import java.util.ArrayList;

public class Search_in_2D {

	public static void main(String[] args) {
	}
	
	static boolean returnElem(int matrix[][], int target) {
		int m=matrix.length;
		int n=matrix[0].length;
		int low=0, high=n*m-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int row=mid/n;
			int col=mid%n;
			if(matrix[row][col]==target)return true;
			else if(matrix[row][col]<target) low=mid+1;
			else high=mid-1;
		}
		return false;
	}
		

}
