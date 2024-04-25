package binary_search_2d;

public class Row_Max_1 {

	public static void main(String[] args) {
		int arr[][]= {{0,0,1},{0,1,1},{0,0,0}};
		System.out.println(findmaxRow(arr));

	}
	static int findmaxRow(int arr[][]) {
		int currentMax=0;
		int maxVal=0;
		int rowno=-1;
		for(int i=0;i<arr.length;i++) {
			int row=findindex(arr[i]);
			currentMax=arr[i].length-1-row;
			if(currentMax>maxVal) {
				maxVal=currentMax;
				rowno=i;
			}
			
		}
		return rowno;
		
	}
	
	
	static int findindex(int arr[]) {
		int n=arr.length;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<1) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return low;
	}

}
