package stack;

import java.util.Arrays;
import java.util.Stack;

public class LargestHistoGram {

	public static void main(String[] args) {
		int arr[]= {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(arr));
	}
	public static int largestRectangleArea(int[] heights) {
        int []left=leftSmall(heights);
        int []right=rightSmall(heights);
        int maxRect=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++) {
        	maxRect=Math.max(maxRect, (right[i]-left[i]+1)*heights[i]);
        }
        return maxRect;
        
    }
	static int[] leftSmall(int arr[]) {
		int ans[]=new int[arr.length];
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=0;
			}
			else {
				ans[i]=stack.peek()+1;
			}
			stack.push(i);
			
			
			
		}
		return ans;
	}
	static int[] rightSmall(int arr[]) {
		int ans[]=new int[arr.length];
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=arr.length-1;
			}
			else {
				ans[i]=stack.peek()-1;
			}
			stack.push(i);
			
			
			
		}
		return ans;
	}

}
