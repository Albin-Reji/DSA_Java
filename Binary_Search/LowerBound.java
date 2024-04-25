package Binary_Search;

public class LowerBound {

	public static void main(String[] args) {
		int arr[]= {3,4,6, 6,7,9,12,16,17, 17, 17};
		System.out.println(upperBound(arr, 8, 6));

	}
	static int lowerBound(int arr[], int n, int x) {
		int low=0;
        int high=n-1;
        int ans=n-1;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(arr[mid]>=x) {
        		ans=mid;
        		high=mid-1;
        	}
        	else {
        		low=mid+1;
        	}
        }
        return ans;
	}
	
	
	public static int upperBound(int []arr, int n, int x) {
		int low=0;
        int high=n-1;
        int ans=n-1;
        while(low<=high) {
        	int mid=low+(high-low)/2;
        	if(arr[mid]>x) {
        		ans=mid;
        		high=mid-1;
        	}
        	else {
        		low=mid+1;
        	}
        }
        return ans;
    }
}
