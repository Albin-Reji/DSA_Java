package array_hard_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4_Sum {

	public static void main(String[] args) {
		
		int arr[]={4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
		int target=9;
		List<List<Integer>> fourSum=fourSum(arr, target);
		for(List<Integer> list: fourSum) {
			System.out.print("[");
			for(Integer i:list) {
				System.out.print(i+" ");
			}
			System.out.print("]\n");
		}
		
	}
	static List<List<Integer>> fourSum(int arr[], int target){
		List<List<Integer>>	ans=new ArrayList<>();	
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(i>0&&arr[i]==arr[i-1])continue;
			for(int j=i+1;j<n;j++) {
				if(j>i+1&&arr[j]==arr[j-1])continue;
				int k=j+1;
				int l=n-1;
				while(k<l) {
					int _4Sum=arr[i]+arr[j]+arr[k]+arr[l];
					if(_4Sum==target) {
						List<Integer> four_Sum=new ArrayList<>();
						four_Sum.add(arr[i]);
						four_Sum.add(arr[j]);
						four_Sum.add(arr[k]);
						four_Sum.add(arr[l]);
						
						ans.add(four_Sum);
						l--;
						k++;
						
						while(k<l&& arr[k]==arr[k-1]) k++;
						while(k<l&& arr[l]==arr[l+1]) l--;
					}
					else if(_4Sum>target) {
						l--;
					}
					else {
						k++;
					}
					
				}
			}
		}
		return ans;
	}

}
