package Binary_Search;

public class Peak_Element {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4,11, 5, 6, 7, 8,9};
		int n=arr.length;
		System.out.println(findPeak(arr, n));
	}
	static int findPeak(int arr[], int n) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) {
				return arr[mid];
			}
			else if(arr[mid]>arr[low]||arr[mid]>arr[mid-1]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

}
