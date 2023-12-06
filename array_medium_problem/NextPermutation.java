package array_medium_problem;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		 int arr[]= {7,6,5,4,3,0,0};
		 nextPermutatin(arr);

	}
	static void nextPermutatin(int nums[]) {
		int index=-1;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				index=i;
			}
			
		}
		if(index==-1) {
			swap(nums, 0, nums.length-1);
			System.out.println(Arrays.toString(nums));
			return;
		}
		for(int i=nums.length-1;i>index;i--) {
			if(nums[i]>nums[index]) {
				int temp=nums[i];
				nums[i]=nums[index];
				nums[index]=nums[i];
				break;
			}
		}
		swap(nums, index+1, nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
	static void swap(int nums[], int start, int end) {
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	
	
	
	

}
