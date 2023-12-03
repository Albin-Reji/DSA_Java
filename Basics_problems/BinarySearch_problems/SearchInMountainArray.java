package BinarySearch_problems;

public class SearchInMountainArray {

	public static void main(String[] args) {
		

	}
	static int binarysearch(int arr[], int target, int start,int end) {
		while(start<=end){
            int mid=(int)(start+end)/2;
            if (target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
		return -1;
	}
	static int peakindexinarray(int arr[]) {
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
