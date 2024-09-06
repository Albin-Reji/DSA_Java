package dp_string;

public class LongPalidromicSubsequence {
	
	public static void main(String[] args) {
		String s="bbbab";
		System.out.println(longestPalindromeSubseq(s));
		
	}
	public static int longestPalindromeSubseq(String s) {
        return findLongestPalindromicSubsequence(s, new StringBuilder(s).reverse().toString());
    }
//	s2=reverse s1 
//	perform lcs in s1, s2 that the ans
	static int findLongestPalindromicSubsequence(String s1, String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		
		for(int index1=1;index1<=s1.length();index1++) {
			for(int index2=1;index2<=s2.length();index2++) {
				if(s1.charAt(index1-1)==s2.charAt(index2-1)) {
					dp[index1][index2]=1+dp[index1-1][index2-1];
				}
				else {
					dp[index1][index2]=Math.max(dp[index1-1][index2], dp[index1][index2-1]);
				}
			}
		}
		return dp[s1.length()][s2.length()];
	}
}
