package twoPte_slidingwindow;

public class Cnt_NiceSubArray {

	public static void main(String[] args) {
		int nums[]= {1,1,2,1,1};
		int k=3;
		System.out.println(numberOfSubarrays(nums, k));

	}
	public static int  findniceArr(int[] nums, int k) {
		if(k<0)return 0;
        int left=0;
        int right=0;
        int sum=0;
        int cnt=0;
        while(right<nums.length) {
        	sum+=nums[right]%2;
        	while(sum>k) {
        		sum-=nums[left]%2;
        		left++;
        	}
        	cnt+=right-left+1;
        	right++;
        }
        return cnt;
	}
	public static int numberOfSubarrays(int[] nums, int k) {
		return findniceArr(nums, k)-findniceArr(nums, k-1);
        
    }

}
