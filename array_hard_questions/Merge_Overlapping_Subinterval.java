package array_hard_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Overlapping_Subinterval {

	public static void main(String[] args) {
		
		int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
		List<List<Integer>> ans=mergeOverlappingInterval(arr);
		 for (List<Integer> it : ans) {
	            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
	     }
		
	} 

	
	
	
	
	
	
// brute fircew approach 
	static List<List<Integer>> mergeOverlappingInterval(int arr[][]){
		int n=arr.length;
		List<List<Integer>> ans=new ArrayList<>();
//		sort the 2d array
		Arrays.sort(arr, Comparator.comparing(a->a[0]));
		for(int i=0;i<n;i++) {
			int start=arr[i][0];
			int end=arr[i][1];
			if(! ans.isEmpty()&& end<=ans.get(ans.size()-1).get(1)) {
				continue;
			}
		
			for(int j=i+1;j<n;j++) {
				if(arr[j][0]<=end) {
					end=Math.max(end, arr[j][1]);
				}
				else {
					break;
				}
			}
			ans.add(Arrays.asList(start, end));
		}
		
		
		
		return ans;
	}

}
