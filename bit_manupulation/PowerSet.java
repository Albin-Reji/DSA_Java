package bit_manupulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		// TODO Auto-generated method stub
//		List<List<Integer>> ans = subsets(nums);
//		System.out.println(ans);
		System.out.println(1 << 3);

	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> finalList = new ArrayList<>();
		for(int i=0;i<1<<nums.length;i++) {
			List<Integer> list = new ArrayList<>();
			int n=i;
			while(n!=0) {
				if((n)==1) {
					list.add(null)
				}
			}
		}

		return finalList;

	}

}
