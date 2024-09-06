package dp_string;

import java.util.Arrays;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace" ;
		System.out.println(longsequence(text1.length()-1, text2.length()-1, text1, text2));

	}
	public static int  longsequence(int index1, int index2, String s, String t) {
		if(index1<0||index2<0)return 0;
		int nequal=Integer.MIN_VALUE;
		int equal=Integer.MIN_VALUE;
		if(s.charAt(index1)==t.charAt(index2)) {
			equal= 1+longsequence(index1-1, index2-1, s, t);
		}
		else {
			nequal= Math.max(longsequence(index1-1, index2, s, t), longsequence(index1, index2-1, s, t));
		}
		return Math.max(nequal, equal);
	}
	public static  int longestCommonSubsequence(String text1, String text2) {
//		int dp[][]=new int[text1.length()][text2.length()];
//		for(int d[]:dp) {
//			Arrays.fill(d, -1);
//		}
//        return lcs(text1.length()-1, text2.length()-1, text1, text2, dp);
		return lcsequence(text1, text2);
    }
	static int lcs(int index1, int index2, String text1, String text2, int dp[][]) {
		if(index1<0||index2<0)return 0;
		
		if(dp[index1][index2]!=-1)return dp[index1][index2];
		if(text1.charAt(index1)==text2.charAt(index2)) {
			return dp[index1][index2]=1+lcs(index1-1, index2-1, text1, text2, dp);
		}
		return dp[index1][index2]=0+Math.max(lcs(index1-1, index2, text1, text2, dp), lcs(index1, index2-1, text1, text2, dp));
	}
	static int lcsequence(String text1, String text2) {
		 int dp[][]=new int[text1.length()+1][text2.length()+1];
		 for(int index1=1;index1<=text1.length();index1++) {
			 for(int index2=1;index2<=text2.length();index2++) {
				 if(text1.charAt(index1-1)==text2.charAt(index2-1)) {
					 dp[index1][index2]=1+dp[index1-1][index2-1];
				 }
				 else {
					 dp[index1][index2]=Math.max(dp[index1-1][index2], dp[index1][index2-1]);
				 }
				 
			 }
		 }
		 for(int i=0;i<text1.length();i++) {
			 for(int j=0;j<text2.length();j++) {
				 System.out.print(dp[i][j]+" ");
			 }
			 System.out.println();
		 }
		 return dp[text1.length()][text2.length()];
		 
	}

}
