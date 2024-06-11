package stack;

public class SubArrayRange {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		System.out.println(subArrayRanges(arr));

	}
	public static long subArrayRanges(int[] nums) {
		long tot=0;
        for(int i=0;i<nums.length;i++) {
        	int smallest=nums[i];
        	int largest=nums[i];
        	for(int j=i+1;j<nums.length;j++) {
        		smallest=Math.min(smallest, nums[j]);
        		largest=Math.max(largest, nums[j]);
        		tot+=largest-smallest;
        	}
        }
        return tot;
    }

}
