package Binary_Search;

public class Floor {

	public static void main(String[] args) {
		
		int arr[]= {3,4,6,7,9,12,16,17};
		System.out.println(findFloor(arr, 16));
	}
	
	
	
	static int findFloor(int arr[], int val) {
		int n=arr.length;
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==val) {
				return mid;
			}
			else if(arr[mid]>val) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return arr[high];
	}

}
