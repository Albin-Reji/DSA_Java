package dp_LIS;


import java.util.Arrays;

public class Longest_Length_LIS {
	public static void main(String[] args) {
		
	}
	public static int findNumberOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        int cnt[]=new int[nums.length];
        int maxi=1;
        Arrays.fill(dp, 1);
        Arrays.fill(cnt, 1);
        for(int ind=0;ind<nums.length;ind++) {
        	for(int prev=0;prev<ind;prev++) {
        		if(nums[ind]>nums[prev]&&dp[prev]+1>dp[ind]) {
        			dp[ind]=1+dp[prev];
        			cnt[ind]=cnt[prev];
        		}
        		else if(nums[prev]<nums[ind]&&1+dp[prev]==dp[ind]) {
        			cnt[ind]+=cnt[prev];
        		}
        	}
        	maxi=Math.max(maxi, dp[ind]);
        }
        int Maxcnt=0;
        for(int i=0;i<nums.length;i++) {
        	Maxcnt+=dp[i]==maxi?cnt[i]:0;
        }
        return Maxcnt;
    }
}
