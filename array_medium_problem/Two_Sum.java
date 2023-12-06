package array_medium_problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
		int arr[]= {2,4,5,8,11};
//		System.out.println(two_sum_better(arr, 14));
//		System.out.println(Arrays.toString(two_sum_better_Return_index(arr, 14)));
		System.out.println(Arrays.toString(two_sum_optimal(arr, 15)));
	}
	
	static int[] two_sum_optimal(int arr[], int target) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int two_sum=arr[left]+arr[right];
			if(two_sum==target) {
				return new int[] {left, right};
			}
			else if(two_sum>target) {
				right--;
			}
			else if(two_sum<target) {
				left++;
			}
			
		}
		return new int[] {-1,-1};
	}
	
	
	static boolean two_sum_better(int arr[], int target) {
		HashMap<Integer, Integer> hash_map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int a=arr[i];
			int more=target-a;
			if(hash_map.containsKey(more)) {
				return true;
			}
			hash_map.put(arr[i], i);
			
		}
		return false;
	}
	static int[] two_sum_better_Return_index(int arr[], int target) {
		HashMap<Integer, Integer> mpp=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int curr_Val=arr[i];
			int need_more=target-curr_Val;
			if(mpp.containsKey(need_more)) {
				return new int[] {i, mpp.get(need_more)};
			}
			mpp.put(arr[i], i);
		}
		return new int[] {-1,-1};
	}

}
