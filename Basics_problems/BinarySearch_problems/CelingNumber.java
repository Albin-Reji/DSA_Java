package BinarySearch_problems;

public class CelingNumber {

	public static void main(String[] args) {
		int arr[]= {2,3,5,9,14,16,18};
//		System.out.println(floornum(arr, 1));
		System.out.println(celing(arr,-10));
	}
	static int celing(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
		int mid;
		if(target<arr[0]||target>arr[arr.length-1]) {
			if(target<arr[0])
				return arr[0];
			return -1;
		}
		else {
			while(low<=high) {
				mid=(int)(low+high)/2;
				if(arr[mid]<target) {
					low=mid+1;
				}
				else if(arr[mid]>target) {
					high=mid-1;
				}
				else {
					return arr[mid];
				}

			}
		}
		
		return arr[low];
	}
	static int floornum(int arr[], int target) {
		int mid;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			mid=(int)(low+high)/2;
			if(arr[mid]<target) {
				low=mid+1;
				
			}
			else if(arr[mid]>target)
				high=mid-1;
			else {
				return arr[mid];
			}
		}
		return arr[high];
	}

}
