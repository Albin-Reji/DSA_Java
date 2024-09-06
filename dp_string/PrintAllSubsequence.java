package dp_string;

import java.util.Arrays;
import java.util.List;

public class PrintAllSubsequence {

	public static void main(String[] args) {
		String s ="aba";
		String t = "baa";
		all_longest_common_subsequences(s, t);

	}
	public static  void all_longest_common_subsequences(String s, String t) {
       int dp[][]=new int[s.length()+1][t.length()+1];
       
       int longest=lcs( s, t, dp);
       for(int d[]:dp) {
    	  System.out.println(Arrays.toString(d));
       }
       int i=s.length();
       int j=t.length();
       StringBuilder str=new StringBuilder();
       while(i>0&&j>0) {
    	   if(s.charAt(i-1)==t.charAt(j-1)) {
    		   str.append(s.charAt(i-1));
    		   i--;
    		   j--;
    	   }
    	   else if(dp[i-1][j]>dp[i][j-1]) {
    		   i--;
    	   }
    	   else {
    		   j--;
    	   }
       }
       System.out.println("longest string is: " + str.reverse().toString());
    }
	static int  lcs( String text1, String text2, int[][] dp) {
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
		return dp[text1.length()][text2.length()];

	}
}
