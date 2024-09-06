package dp_string;

public class MinInsertion_2_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  static int minInsertions(String s) {
        return s.length()-findLongestPalindromicSubsequence(s, new StringBuilder(s).reverse().toString());
    }
	static int findLongestPalindromicSubsequence(String s1, String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		int maxPali=Integer.MIN_VALUE;
		for(int index1=1;index1<=s1.length();index1++) {
			for(int index2=1;index2<=s2.length();index2++) {
				if(s1.charAt(index1-1)==s2.charAt(index2-1)) {
					dp[index1][index2]=1+dp[index1-1][index2-1];
				}
				else {
					dp[index1][index2]=Math.max(dp[index1-1][index2], dp[index1][index2-1]);
				}
				maxPali=Math.max(maxPali, dp[index1][index2]);
			}
		}
		return maxPali;
	}

}
