package stack;

import java.util.Arrays;
import java.util.Stack;

public class MinSubarr {

	public static void main(String[] args) {
		int arr[]= {3,1,2,4};
		System.out.println(Arrays.toString(findprevSmaller(arr)));

	}
	public  static int sumSubarrayMins(int[] arr) {
        int[] nxtsmall=findnxtSmaller(arr);
        int[] prevsmall=findprevSmaller(arr);
        int mod=1000000007;
        long cnt=0;
        for(int i=0;i<arr.length;i++) {
        	int first=i-prevsmall[i];
        	int second=nxtsmall[i]-i;
        	long prod=(first*second)%mod;
        	cnt=(cnt%mod+prod)%mod;
        	
        	
        }
        return (int)cnt;
    }
	static int[] findnxtSmaller(int arr[]) {
		Stack<Integer> st=new Stack<Integer>();
		int ans[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			while(!st.isEmpty()&&arr[st.peek()]>=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=arr.length;
			}
			else {
				ans[i]=st.peek();
			}
			st.push(i);
		}
		return ans;
	}
	
	static int[] findprevSmaller(int arr[]) {
		Stack<Integer> st=new Stack<Integer>();
		int ans[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty()&&arr[st.peek()]>=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=-1;
			}
			else {
				ans[i]=st.peek();
			}
			st.push(i);
		}
		return ans;
	}
}
