package BinarySearch_problems;

public class RotatedBinarySearch {

	public static void main(String[] args) {
/*		
 *
 * this will not work for duplicate values
 * 
 * 
Input: Array[] = {7 9 1 3 5}, target= 7
output= 0
Input: Array[] = {1, 2, 3, 4, 5}, target = 4.
Output: 3   
 */
		
		int arr[]={3, 4,4, 3, 3 ,3};
		System.out.println(search(arr, 3));

	}
	
	static int search(int nums[], int target) {
		int start=0;
		int end=nums.length-1;
		int pivot=findpivot(nums);
		if(pivot==-1) {
			return binarysearch(nums, target, start,end);
			
		}
		if (nums[pivot]==target) {
			return pivot;
		}
		if(nums[start]<=target) {
			return binarysearch(nums, target, 0, pivot-1);
			
		}
		return binarysearch(nums, target, pivot+1, nums.length-1);
		
			
	}
	
	static int binarysearch(int nums[],int target, int start, int end) {
	
		while(start<=end) {
			int mid=(int)(start+end)/2;
			if(nums[mid]>target) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	
	static int findpivot(int nums[]) {
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=(int)(start+end)/2;
			if(mid>start&&nums[mid]<nums[mid-1]){
				return mid-1;
			}
			if(mid<end && nums[mid]>nums[mid+1]) {
				return mid;
			}
			
			if(nums[mid]<=nums[start]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
			
		return -1;
	}

}
