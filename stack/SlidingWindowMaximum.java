package stack;import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;


public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int nums[]= {100,80,60,70,60,75,85};
		int k = 3;
		System.out.println(Arrays.toString(prevGreater(nums)));
	}
	public static int[] prevGreater(int[] nums) {
		int ansList[]=new int[nums.length];
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<nums.length;i++) {
			while(!stack.isEmpty()&&nums[stack.peek()]<=nums[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ansList[i]=i+1;
			}
			else {
				ansList[i]=i-stack.peek();
			}
			stack.push(i);
		}
		return ansList;
	}
	
	
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int ri=0;
		int ans[]=new int [nums.length-k+1];
		Deque<Integer> q=new ArrayDeque<Integer>();
        for(int i=0;i<nums.length;i++) {
        	if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            if (i >= k - 1) {
                ans[ri++] = nums[q.peek()];
            }
        }
		return ans;
    }

}  
