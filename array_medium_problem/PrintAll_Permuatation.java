package array_medium_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAll_Permuatation {

	public static void main(String[] args) {
		int nums[]= {1,2,3};
		List<List<Integer>> ans=permute(nums);
		for(List<Integer> i:ans) {
			System.out.println(i);
			
		}
	}
	static void printAll(int index, int nums[], List<List<Integer>> ans) {
		if(index==nums.length-1) {
			List<Integer> ds=new ArrayList<>();
			for(int i=0;i<nums.length;i++) {
				ds.add(nums[i]);
			}
			ans.add(ds);
			return;
		}
		for(int i=index;i<nums.length;i++) {
			swap(i, index, nums);
			printAll(index+1, nums, ans);
			swap(i, index, nums);
		}
	}
	static void swap(int i, int j, int nums[]) {
		int t=nums[i];
		nums[i]=nums[j];
		nums[j]=t;
	}
	static List<List<Integer>> permute(int nums[]){
		List<List<Integer>> ans=new ArrayList<>();
		printAll(0, nums, ans);
		return ans;
	}

}
