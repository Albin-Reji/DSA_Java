package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NxtGreater_II {

	public static void main(String[] args) {
		int arr[]= {1,2,1};
		
		
		System.out.println(Arrays.toString(nextGreaterElements(arr)));
		
		
	}
	public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<Integer>();
        int n=nums.length;
        int res[]=new int[n];
        for(int i=2*n-1;i>=0;i--) {
        	while(!st.isEmpty()&&st.peek()<=nums[i%n]) {
        		st.pop();
        	}
        	if(i<n) {
        		if(st.isEmpty()) {
        			res[i]=-1;
        		}
        		else {
        			res[i]=st.peek();
        		}
        	}
        	st.push(nums[i%n]);
        }
        return res;
    }
	
	
	static int[] concat(int arr[]) {
		int ans[]=new int[2*arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[i]=arr[i];
		}
		for(int i=arr.length;i<ans.length;i++) {
			ans[i]=arr[i-arr.length];
		}
		
		return ans;
	}
	
}
