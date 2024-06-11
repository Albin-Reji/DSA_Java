package twoPte_slidingwindow;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Number_of_Substrings_Containing_All_Three_Characters {

	public static void main(String[] args) {
		int []happiness = {1,2,3};
		int k = 2;
		maximumHappinessSum(happiness, k);
	}
	
	public static void maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int j=0;
        int maxHappy=0;
        for(int i=happiness.length-1;i>=0&&k!=0;i--) {
        	maxHappy=maxHappy+happiness[i]-j;
        	j++;
        	k--;
        }
        return maxHappy;
    }
	public static int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxFreq=0;
        int maxLen=0;
        int arr[]=new int[26];
        while(right<s.length()) {
        	arr[s.charAt(right)-'A']++;
        	maxFreq=Math.max(maxFreq,arr[s.charAt(right)-'A'] );
        	if((right-left+1)-maxFreq>k) {
        		arr[s.charAt(right)-'A']--;
        		left++;
        	}
        	maxLen=Math.max(right-left+1, maxLen);
        }
        return maxLen;
    }
	
	
	
	public static  int numberOfSubstrings(String s) {
        int right=0;
        int n=s.length();
        int lastSeen[]= {-1,-1,-1};
        int maxCnt=0;
        while(right<n) {
        	lastSeen[s.charAt(right)-'a']=right;
        	if(lastSeen[0]>-1&&lastSeen[1]>-1&&lastSeen[2]>-1) {
        		int min=Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]);
        		maxCnt+=min+1;
        	}
        	right++;
        	
        }
        return maxCnt;
    }

}
