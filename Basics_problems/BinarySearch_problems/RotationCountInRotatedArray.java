package BinarySearch_problems;

public class RotationCountInRotatedArray {

	public static void main(String[] args) {
		int arr[]= {15, 18,19,20, 2, 3, 6, 12};
		System.out.println(rotation_count(arr));
	}
	
	static int rotation_count(int arr[]) {
		int last=findpivot(arr);
		if(last!=-1) {
			return last+1;
		}
		return -1;
	}
	
	
	static int findpivot(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(int)(start+end)/2;
			if(arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[start]<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
		}
		return -1;
	}
	
	
	
}
