package array_medium_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrageArr {

	public static void main(String[] args) {
		int arr[]= {3,1,-2,-5,2,-4, 5, 7 , -9, -10, -3,-56,-76};
		System.out.println(Arrays.toString(rearrange_pos_neg(arr)));

	}
	static int[] rearrange_pos_neg(int nums[]) {
		int j=0;
		int k=0;
		int l=0;
		ArrayList<Integer> positive_list=new ArrayList<>();
		ArrayList<Integer> negative_list=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				negative_list.add(nums[i]);
			}
			else {
				positive_list.add(nums[i]);
			}
		}
		while(j<positive_list.size()&&k<negative_list.size()) {
			nums[l]=positive_list.get(j)	;
			j++;
			l+=1;
			nums[l]=negative_list.get(k);
			k++;
			l+=1;
		}
		if(j<positive_list.size()) {
			nums[l]=positive_list.get(j);
			j++;
			l++;
		}
		if(k<negative_list.size()) {
			nums[l]=negative_list.get(k);
			k++;
			l++;
		}
		return nums;
		
	}
	
	
	
//	if it hving equql positive and equal negative
	static int[] reARRange(int nums[]) {
		int res[]=new int[nums.length];
		int neg_ptr=1;
		int pos_ptr=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<0) {
				res[neg_ptr]=nums[i];
				neg_ptr+=2;
			}
			else {
				res[pos_ptr]=nums[i];
				pos_ptr+=2;
			}
		}
		return res;
	}

}
