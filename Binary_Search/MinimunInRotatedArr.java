package Binary_Search;

public class MinimunInRotatedArr {

	public static void main(String[] args) {
		int arr[]= {7, 8, 9, 1, 2, 3, 4, 5, 6};
		System.out.println(minimumElem(arr, arr.length));

	}
	static int minimumElem(int arr[], int n) {
		int low=0;
		int high=n-1;
		int pivot=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[low]<=arr[mid]) {
				low=mid+1;
				
			}
			else if(arr[low]>arr[mid]) {
				high=mid-1;
			}
			else if(arr[mid]>arr[mid+1]) {
				pivot=mid;
			}
			else if(arr[mid]<arr[mid-1]) {
				pivot=mid-1;
			}
		}
		return pivot+1;
	}

}
