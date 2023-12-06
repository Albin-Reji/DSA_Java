package array_medium_problem;

import java.util.concurrent.ConcurrentSkipListSet;

public class Max_Sum_Subarray_Kadnes_ALgo {

	public static void main(String[] args) {
		int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		maxSubarray(arr);

	}
	static void  maxSubarray(int arr[]) {
		int start=-1;
		int end=-1;
		int sum=0;
		int max_sum=-1000;
		for(int i=0;i<arr.length;i++) {
			if(sum<0) {
				sum=0;
				start=i;
			}
			sum+=arr[i];
			
			if(sum>max_sum) {
				end=i;
			}
			max_sum=Math.max(max_sum, sum);
		}
		System.out.println(max_sum);
		System.out.println(start);
		System.out.println(end);
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]+" ");
		}
			
	}
		
}
