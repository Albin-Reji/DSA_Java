package Binary_Search;

public class NoOfOccurences {

	public static void main(String[] args) {
		int arr[]= {3,4,6, 6,7, 7,7,7, 7,9,12,16,17, 17, 17};
		int n=arr.length;
		int x=17;
		System.out.println(numberofOccurences(arr, n, x));

	}
	static int numberofOccurences(int arr[], int n, int x) {
		int first=firstIndex(arr, n, x);
		int last=lastIndex(arr, n, x);
		return last+1-first;
	}
	
	static int firstIndex(int arr[], int n, int x) {
		int low=0;
		int high=n-1;
		int first=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x) {
				first=mid;
				high=mid-1;
			}
			else if(arr[mid]<x) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return first;
	}
	
	static int lastIndex(int arr[], int n, int x) {
		int low=0;
		int high=n-1;
		int last=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x) {
				last=mid;
				low=mid+1;
			}
			else if(arr[mid]>x) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return last;
	}

}
