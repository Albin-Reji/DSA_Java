package array_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class Longest_SubArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,1,1,1,4,2,3};
		optimal_subarray(arr, 7);

	}
	static void optimal_subarray(int arr[], int k) {
		int left=0, right=0;
		int sum=arr[0];
		int n=arr.length;
		int max_len=0;
		while(right<n) {
			while(left<=right&&sum>k) {
				sum=sum-arr[left];
				left++;
			}
			if(sum==k) {
				max_len=Math.max(max_len, right-left+1);
			}
			right++;
			if(right<n) {
				sum+=arr[right];
			}
		}
		System.out.println(max_len);;
	}
	
	
	
	static void better_longestsubarray(int arr[], long k) {
		Map<Long, Integer> presumMap=new HashMap<>();
		long sum=0;
		int max_len=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==k) {
				max_len=Math.max(max_len, i+1);
			}
			long rem=sum-k;
			if (presumMap.containsKey(rem)) {
                int len = i - presumMap.get(rem);
                max_len = Math.max(max_len, len);
            }
			 if (!presumMap.containsKey(sum)) {
	                presumMap.put(sum, i);
	            }
		}
		System.out.println(max_len);
	}

}
