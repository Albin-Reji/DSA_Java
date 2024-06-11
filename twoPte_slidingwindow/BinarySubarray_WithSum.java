package twoPte_slidingwindow;

public class BinarySubarray_WithSum {

	public static void main(String[] args) {
		int[]nums = {1,2,1,2,3};
		int goal = 2;
		System.out.println(numSubarraysWithSum(nums, goal));
		System.out.println(numSubarraysWithSum(nums, goal-1));
		System.out.println(findGoal(nums, goal));

	}
	static int findGoal(int nums[], int goal) {
		return numSubarraysWithSum(nums, goal)-numSubarraysWithSum(nums, goal-1);
	}
	public static int numSubarraysWithSum(int[] nums, int goal) {
		if(goal<0)return 0;
        int left=0;
        int right=0;
        int sum=0;
        int cnt=0;
        while(right<nums.length) {
        	sum+=nums[right];
        	
        	while(sum>goal) {
        		sum=sum-nums[left];
        		left++;
        	}
        	cnt+=right-left+1;
        	right++; 
        }
        return cnt;
    }

}
