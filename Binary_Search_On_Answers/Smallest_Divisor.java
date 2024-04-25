package Binary_Search_On_Answers;

public class Smallest_Divisor {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);

	}
	public static int smallestDivisor(int arr[], int threshold) {
		int n=arr.length;
		int low=arr[0];
		int high=arr[n-1];
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(isDivisble(arr, threshold, mid)) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return low;
		
		
	}
	static boolean isDivisble(int arr[], int threshold, int divisor) {
		int calculated_Threshold=0;
		for(int i=0;i<arr.length;i++) {
			calculated_Threshold+=Math.ceil((double)arr[i]/(double)divisor);
		}
		return calculated_Threshold<=threshold;
	}

}
