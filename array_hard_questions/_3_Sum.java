package array_hard_questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3_Sum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4};
		
		List<List<Integer>> ans_list=Sum_arr(arr);
		for(List<Integer> list:ans_list) {
			System.out.print("[");
			for(Integer i:list) {
				System.out.print(i+" ");
			}
			System.out.print("]");
			System.out.println();
		}

	}
	static List<List<Integer>> Sum_arr(int arr[]) {
		List<List<Integer>> threeSum=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = arr.length - 1;
			while(j<k) {
				int sum=arr[i]+arr[j]+arr[k];
				if(sum<0) {
					j++;
				}
				else if(sum>0) {
					k--;
				}
				else {
					List<Integer> tmp=Arrays.asList(arr[i],arr[j],arr[k]);
					threeSum.add(tmp);
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1]) {
						j++;
					}
		            while (j < k && arr[k] == arr[k + 1])
		            	k--;
				}
			}
		}
		return threeSum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	static List<List<Integer>> triplet (int arr[]){
		Set<List<Integer>> st=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			Set<Integer> hashset = new HashSet<>();
			for(int j=i+1;j<arr.length;j++) {
				int third=-(arr[i]+arr[j]);
				
				if(hashset.contains(third)) {
					List<Integer> tmp=Arrays.asList(arr[i],arr[j], third);
					tmp.sort(null);
					st.add(tmp);
				}
				hashset.add(arr[j]);
			}
		}
		List<List<Integer>> ans=new ArrayList<>(st);
		return ans;
	}

}
