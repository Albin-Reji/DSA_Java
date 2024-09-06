package dp_LIS;

import java.util.Arrays;

public class LongestBitonicSubsequence {
	public static void main(String[] args) {
		int nums[]= {1,11,2,10,4,5,2,1};
		LongestBitonicSequence(nums.length, nums);
	}
	public static  void  LongestBitonicSequence(int n, int[] nums) {
	     int dpFront[]=new int[nums.length];
	     Arrays.fill(dpFront, 1);
	     int dpBack[]=new int[nums.length];
	     Arrays.fill(dpBack, 1);
	     for(int i=0;i<n;i++) {
	    	 for (int j=0;j<i;j++){
	    		 if(nums[i]>nums[j]&&dpFront[j]+1>dpFront[i]) {
	    			 dpFront[i]=dpFront[j]+1;
	    		 }
	    	 }
	     }
	     for(int i=n-1;i>=0;i--) {
	    	 for(int j=n-1;j>i;j--) {
	    		 if(nums[i]>nums[j]&&dpBack[j]+1>dpBack[i]) {
	    			 dpBack[i]=dpBack[j]+1;
	    		 }
	    	 }
	     }
	     int longest=0;
	     for(int i=0;i<n;i++) {
	    	 longest=Math.max(longest, dpFront[i]+dpBack[i]-1);
	     }
	     System.out.println(Arrays.toString(dpFront));
	     System.out.println(Arrays.toString(dpBack));
	     System.out.println(longest);
	 }
}
