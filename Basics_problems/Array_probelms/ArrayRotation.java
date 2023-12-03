package Array_probelms;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		optimal_rotate(arr, 2);
		

	}
//	 if  only on erotation
	static int[] left_rotate(int arr[]) {
		int temp=arr[0];
		for(int i=1;i<=arr.length-1;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		return arr;
	}
	// for n number of rotation;
	static void leftrotate(int nums[], int k) {
		int n=nums.length;
		int num_rotate=n-k;
		int temp;
		for(int j=0;j<num_rotate;j++) {
			temp=nums[n-1];
			for (int i=n-2;i>=0;i--) {
				swap(nums, i,i+1);
			}
			nums[0]=temp;
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	static void swap(int arr[],int a,int b) {
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		
	}
//	 very optimal solution
	static void optimal_rotate(int nums[], int k) {
		int n=nums.length;
		k%=n;
		reverseNum(nums, 0, n-1);
		reverseNum(nums, 0, k-1);
		reverseNum(nums, k, n-1);
		System.out.println(Arrays.toString(nums));
		
		
	}
	static void reverseNum(int arr[],int start, int end) {
		while(start<=end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
