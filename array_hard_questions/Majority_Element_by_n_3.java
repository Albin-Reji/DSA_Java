package array_hard_questions;
import java.util.ArrayList;
import java.util.List;

public class Majority_Element_by_n_3 {

	public static void main(String[] args) {
		int nums[]= {11, 33, 33, 11, 33, 11};
		ArrayList<Integer> ansList=findMajorElemenet(nums);
		for(int i :ansList) {
			System.out.println(i);
		}

	}
	static ArrayList<Integer> findMajorElemenet(int nums[]){
		
		int elem1=Integer.MIN_VALUE;
		int elem2=Integer.MIN_VALUE;
		int cnt1=0;
		int cnt2=0;
		int floor_val=(int)(nums.length/3)+1;
		for(int i=0;i<nums.length;i++) {
			if(cnt1==0&&nums[i]!=elem2) {
				cnt1=1;
				elem1=nums[i];
				
			}
			else if(cnt2==0&&nums[i]!=elem1) {
				cnt2=1;
				elem2=nums[i];
			}
			else if(nums[i]==elem1) {
				cnt1+=1;
			}
			else if(nums[i]==elem2) {
				cnt2+=1;
			}
			else {
				cnt1--;cnt2--;
			}
		}
		ArrayList<Integer> majorElements=new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elem1) cnt1++;
            if (nums[i] == elem2) cnt2++;
        }
		
		if(cnt1>floor_val) {
			majorElements.add(elem1);
		}
		if(cnt2>floor_val) {
			majorElements.add(elem2);
		}
		return majorElements;
	}
		

}
