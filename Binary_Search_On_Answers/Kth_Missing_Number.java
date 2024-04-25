package Binary_Search_On_Answers;

public class Kth_Missing_Number {

	public static void main(String[] args) {
		int[] arr = {4, 7, 9, 10};
		int k=5;
		System.out.println(findMissing(arr,k));

	}
	static int findMissing(int arr[], int k) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int missing=arr[mid]-(mid+1);
			if(missing<k) {
				low=mid+1;
			}
			else {
				high=mid-1; 
			}
		}
		return  k + high+1;
	}

}
