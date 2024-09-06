package dp_string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSequence {

	public static void main(String[] args) {

		String	s ="rabbbit";
		String t = "rabbit";
		System.out.println(numDistinct(s, t));
	}
	public static int numDistinct(String s, String t) {
		int dp[][]=new int[s.length()+1][t.length()+1];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        return findDistinctSequences( s, t);
    }
	static int findDistinctSeq(int index1, int index2,String s , String t, int dp[][]) {
		if(index2==0)return 1;
		if(index1==0)return 0;
		if(dp[index1][index2]!=-1)return dp[index1][index2];
		if(s.charAt(index1)==t.charAt(index2)) {
			return dp[index1-1][index2-1]=findDistinctSeq(index1-1, index2-1, s, t, dp)+findDistinctSequences(index1-1, index2, s, t, dp);
		}
		else {
			return dp[index1][index2]=findDistinctSeq(index1-1, index2, s, t, dp);
		}
	}
	
	static int findDistinctSequences(String s , String t) {
		int dp[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<=s.length();i++) {
			dp[i][0]=1;
		}
		
		for(int index1=1;index1<=s.length();index1++) {
			for(int index2=1;index2<=t.length();index2++) {
				if(s.charAt(index1-1)==t.charAt(index2-1)) {
					dp[index1][index2]=dp[index1-1][index2-1]+dp[index1-1][index2];
				}
				else {
					dp[index1][index2]=dp[index1-1][index2];
				}
			}
		}
		return dp[s.length()][t.length()];
	}

}
