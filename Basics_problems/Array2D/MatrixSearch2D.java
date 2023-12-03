package Array2D;

public class MatrixSearch2D {

	public static void main(String[] args) {
			int arr[][]= {
					{10,20,30,40},
					{15,25,35,45},
					{28,29,37,47},
					{38,39,40,48}
			};
			int target=87;
			int res[]=search(arr,target);
			System.out.println("Element "+target+" found in row: "+res[0]+" col: "+res[1]);

	}
	static int[] search(int arr[][], int target) {
		int c=arr.length-1;
		int r=0;
		while(r<arr.length&& c>=0) {
			if(arr[r][c]==target) {
				return new int[] {r, c};
			}
			else if(arr[r][c]>target) {
				c--;
			}
			else {
				r++;
			}
		}
		return new int[] {-1,-1};
	}

}
