package stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;


public class NctGreaterElem {

	public static void main(String[] args) {
		int num1[]= {1,3,5,2,4};
		int num2[]= {6,5,4,3,2,1,7};
		int nums[]= {4,12,5,3,1,2,4,5,3,1,2,4,6};
		System.out.println("ANswer Array"+Arrays.toString(nxtGreater(num1,num2)));
		
	}
	static int[] nxtGreater(int nums1[],int nums2[]) {
		Stack<Integer> st=new Stack<Integer>();
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int[] ans=new int[nums1.length];
		for(int i=nums2.length-1;i>=0;i--) {
			if(st.isEmpty()) {
				
				st.push(nums2[i]);
				map.put(nums2[i], -1);
			}
			else {
				if(nums2[i]<st.peek()) {
					map.put(nums2[i], st.peek());
					st.push(nums2[i]);
				}
				else {
					while(!st.isEmpty()&&nums2[i]>st.peek()) {
						st.pop();
					}
					if(st.isEmpty()) {
						map.put(nums2[i], -1);
						st.push(nums2[i]);
					}
					else {
						map.put(nums2[i], st.peek());
					}
					
					
				}
				
			}
		}
		for(int j=0;j<nums1.length;j++) {
			ans[j]=map.get(nums1[j]);
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
		return ans;
	}
	 
	
	
	
	static void displayStack(Stack<Integer> st) {
		for(int i:st) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}

