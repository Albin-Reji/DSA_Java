package dp_string;

public class MinOperation_2_makeEqualString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static  int minDistance(String word1, String word2) {
        int longestMatching=findLongestMatching(word1, word2);
        int minDistance=(word1.length()-longestMatching)+(word2.length()-longestMatching);
        return minDistance;
    }
	static int findLongestMatching(String s1, String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		int longestMachingSubsequenc=Integer.MIN_VALUE;
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i][j]+1;
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
				longestMachingSubsequenc=Math.max(longestMachingSubsequenc, dp[i][j]);
			}
		}
		return longestMachingSubsequenc;
	}

}
