package Binary_Search_On_Answers;

public class Painters_Partition {

	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40};
		System.out.println(findLargestPainter(arr, 2));
		

	}
	static int findLargestPainter(int arr[], int k) {
		int low=Integer.MIN_VALUE, high=0, n=arr.length;
		if(k>arr.length)return -1;
		for(int i=0;i<n;i++) {
			low=Math.max(arr[i], low);
			high+=arr[i];
		}
		while(low<=high) {
			int mid=(low+high)/2;
			int painterMax=paintersCount(arr, mid);
			if(painterMax>k) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return high;
	}
	static int paintersCount(int arr[], int paint) {
		int n=arr.length;
		int painterCnt=1;
		int totalpaints=0;
		
		for(int i=0;i<n;i++) {
			if(totalpaints+arr[i]<paint) {
				totalpaints+=arr[i];
			}
			else {
				painterCnt+=1;
				totalpaints=arr[i];
			}
		}
		return painterCnt;
	}
	

}
