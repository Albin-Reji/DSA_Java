package dp_subsequence;

public class TargetSum_Sign {

	public static void main(String[] args) {
		int nums[]= {1,1,1,1,1};
		int target=3;
		System.out.println(findTargetSumWays(nums, target));

	}
	public static  int findTargetSumWays(int[] nums, int target) {
        return cntTargetSum(nums.length-1, nums, target);
    }
	static int cntTargetSum(int index, int arr[], int target) {
		if(index==0) {
			if(arr[index]==target||target==-arr[index]) {
				return 1;
			}
			return 0;
			
		}
		
		
		int	take=cntTargetSum(index-1, arr, target-arr[index]);
		int nottake=cntTargetSum(index-1, arr, target+arr[index]);
		return take+nottake;
	}

}
