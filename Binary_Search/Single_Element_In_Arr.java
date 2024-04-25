package Binary_Search;

public class Single_Element_In_Arr {

	public static void main(String[] args) {
		int arr[]= {1, 1, 2, 2, 3, 4,4, 5, 5, 6, 6};
		int n=arr.length;
		System.out.println(returnSingle_Element(arr, n));

	}
	
	static int returnSingle_Element(int arr[], int n) {
		int low=0;
		int high=n-1;
		if(n==1) return arr[0];
		if(arr[0]!=arr[1])return arr[0];
		if(arr[n-1]!=arr[n-2])return arr[n-1];
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]) {
				return arr[mid];
			}
			if(mid%2==1&&arr[mid]==arr[mid-1] || mid%2==0&&arr[mid]==arr[mid+1]) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}

}
