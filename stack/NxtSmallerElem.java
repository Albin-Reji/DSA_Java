package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NxtSmallerElem {

	public static void main(String[] args) {
		int nums[]= {3, 2, 1};
		System.out.println(Arrays.toString(prevSmaller(nums)));

	}
	public static int [] prevSmaller(int nums[]) {
		Stack<Integer> stack=new Stack<Integer>();
		int ans[]=new int[nums.length];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			while(!stack.isEmpty()&&stack.peek()>=nums[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				map.put(nums[i], -1);
			}
			else {
				map.put(nums[i],stack.peek());
			}
			stack.push(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			ans[i]=map.get(nums[i]);
		}
		return ans;
		
    }

}
