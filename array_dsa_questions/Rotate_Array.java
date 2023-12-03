package array_dsa_questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(left_rotate(arr, 2)));

	}
	static int[] left_rotate(int arr[], int rotate) {
		int half=(arr.length-1)-rotate;
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, half);
		reverse(arr, half+1, arr.length-1);
		return arr;
		
	}
	static void reverse(int arr[], int start, int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	

}
