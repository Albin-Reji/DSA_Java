package BinarySearch_problems;

public class ElemSearchInInfiniteArray {

	public static void main(String[] args) {
		int arr[]= {3,4,7,9,10,90,100,130,140,160,170};
		int target=100;
		System.out.println(ans(arr, target));

	}
	static int ans(int arr[], int target) {
		int low=0;
		int high=1;
		//condition for checking
		while(target>arr[high]) {
			int temp=high+1;
			high=high+(high-low+1)*2;
			low=temp;
		}
		return binarysearch(arr, target, low, high);
		
	}
	static int binarysearch(int arr[], int target, int low, int high) {
		
		while(low<=high){
            int mid=(int)(low+high)/2;
            if (target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                return mid;
            }
        }
		return -1;
	}

}
