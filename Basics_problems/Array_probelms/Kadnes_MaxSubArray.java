package Array_probelms;

public class Kadnes_MaxSubArray {

	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		int a[]= {-4,-3,-2,-1};
		System.out.println(maxSubarraySum(a));

	}
	static int maxSubarraySum(int arr[]) {
		int n=arr.length;
		int sum=0;
		int max_sum=-1000000;
		int start=-1;
		int end=-1;
		for(int i=0;i<n;i++) {
			if(sum==0) {
				start=i;
			}
			sum+=arr[i];
			if(sum>max_sum) {
				end=i;
			}
			max_sum=Math.max(sum,max_sum );
			if(sum<0) {
				sum=0;
			}
			
		}
		System.out.println("index of max subarray\nstart :"+start+"\nend :"+end);
		return max_sum;
	}

}
