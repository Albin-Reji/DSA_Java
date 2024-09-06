package dp_string;

import java.util.Arrays;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		String str1="abcd";
		String str2="abzd";
		System.out.println(longestCommonSubstr(str1, str2));
	}
	 public static  int longestCommonSubstr(String str1, String str2) {
	     return   dpArr(str1, str2);
	        
	 }
	
	static int dpArr(String s1, String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		int maxLen=Integer.MIN_VALUE;
		
		for(int index1=1;index1<=s1.length();index1++) {
			for(int index2=1;index2<=s2.length();index2++) {
				if(s1.charAt(index1-1)==s2.charAt(index2-1)) {
					dp[index1][index2]=1+dp[index1-1][index2-1];
				}
				else {
					dp[index1][index2]=0;
				}
				maxLen=Math.max(maxLen, dp[index1][index2]);
			}
		}
		return maxLen;
	}

}
