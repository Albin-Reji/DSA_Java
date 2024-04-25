package Binary_Search;

public class SearchInRotatedSortedArr {

	public static void main(String[] args) {
		int arr[]= {7, 8, 9, 1, 2, 3, 4, 5, 6};
		System.out.println(findIndex(arr, 1));

	}
	
	static int findIndex(int arr[], int val) {
		int n=arr.length;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==val) {
				return mid;
			}
			if(arr[low]<=arr[mid]) {
				if(arr[low]<=val&&val<=arr[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if(arr[mid]<=val&& val<=arr[high]) {
					low=mid+1;
					
				}
				else {
					high=mid-1;
				}
				
			}
		}
		return -1;
	}

}
