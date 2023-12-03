package BinarySearch_problems;

import java.util.Arrays;

public class IndexRange {

	public static void main(String[] args) {
		int nums[] = {5,7,7,8,8,8,8,10};
		int res[]=searchRange(nums, 8);
		System.out.println(Arrays.toString(res));

	}
	public static int[] searchRange(int[] nums, int target) {
      int start=search(nums, target, true)  ;
      int end=search(nums, target, false);
      return new int[] {start,end};
        
    }
	static int  search(int nums[],int target, boolean findstartindex) {
		int ans=-1;;
		int low=0;
        int high=nums.length-1;
        int mid;
        while(low<=high){
            mid=(int)(low+high)/2;
            if(target<nums[mid])
                high=mid-1;
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                ans=mid;
                if(findstartindex) {
                	high=mid-1;
                }
                else {
                	low=mid+1;
                }
                
            }
        }
        return ans;
	}

}
