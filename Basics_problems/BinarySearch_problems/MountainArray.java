package BinarySearch_problems;

public class MountainArray {

	public static void main(String[] args) {
//		int arr[]= {1,3,5,7,8,9,10,6,4,2,0};
//		int arr[]= {1,2,3,4,5,6,7,8,9};
		int arr[]= {};
		System.out.println(mountindex(arr));

	}
	public static int mountindex(int arr[]) {
			int start=0;
			int end=arr.length-1;
			while(start<end) {
				int mid=start+(end-start)/2;
				if(arr[mid]>arr[mid+1]) {
					end=mid;
					
				}
				else {
					start=mid+1;
				}
			}
			return start;
	}

}
