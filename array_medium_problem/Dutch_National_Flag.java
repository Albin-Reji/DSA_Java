package array_medium_problem;

import java.util.Arrays;

public class Dutch_National_Flag {

	public static void main(String[] args) {
		int arr[]= { 0, 1, 1, 2, 1, 2, 0, 1 };
		System.out.println(Arrays.toString(duch_national_flag(arr)));

	}
	static int[] duch_national_flag(int arr[]) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr, low, mid);
				low++;
				mid++;
				
			}
			else if(arr[mid]==1) {
				mid++;
			}
			else if(arr[mid]==2) {
				swap(arr, mid, high);
				high--;
			}
		}
		return arr;
	}
	static void swap(int arr[], int start, int end){
		int temp;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
