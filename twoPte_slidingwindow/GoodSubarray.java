package twoPte_slidingwindow;

import java.util.HashMap;

public class GoodSubarray {

	public static void main(String[] args) {
		int nums[]= {1,2,1,3,4};
		int k=3;
		System.out.println(goodSubarrays(nums, nums.length, k));

	}
	public static int goodSubarrays(int arr[], int n,int b) {
       return findSubarray(arr, b)-findSubarray(arr, b-1);
    }
    static int findSubarray(int nums[], int k){
    	if(k<0)return 0;
        int left=0;
        int right=0;
        int cnt=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        while(right<nums.length){
            if(map.containsKey(nums[right])){
                map.put(nums[right], map.get(nums[right])+1);
            }
            else{
                map.put(nums[right],1);
            }
            while(map.size()>k) {
            	map.put(nums[left], map.get(nums[left])-1);
            	if(map.get(nums[left])==0) {
            		map.remove(nums[left]);
            	}
            	left++;
            }
            cnt+=right-left+1;
            right++;
        }
        return cnt;

    }

}
