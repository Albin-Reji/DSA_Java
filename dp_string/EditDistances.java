package dp_string;

import java.util.Arrays;

public class EditDistances {
	public static void main(String[] args) {
		String word1 = "horse";
		String word2 = "ros";
		System.out.println(minDistance(word1, word2));
	}

	public static  int minDistance(String word1, String word2) {
		int dp[][]=new int[word1.length()+1][word2.length()+1];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        return findDistance(word1.length(), word2.length(), word1, word2, dp);
    }
	static int findDistance(int index1, int index2, String s, String t, int dp[][]) {
		if(index1==0)return index2+1;
		if(index2==0)return index1+1;
		
		int insert=Integer.MAX_VALUE;
		int delete=Integer.MAX_VALUE;
		int replace=Integer.MAX_VALUE;
		if(dp[index1][index2]!=-1)return dp[index1][index2];
		if(s.charAt(index1-1)==t.charAt(index2-1)) {
			return dp[index1][index2]=0+findDistance(index1-1, index2-1, s, t, dp);
		}
		else {
			insert=1+findDistance(index1, index2-1, s, t, dp);
			delete=1+findDistance(index1-1, index2, s, t, dp);
			replace=1+findDistance(index1-1, index2-1, s, t, dp);
		}
		return dp[index1][index2]=Math.min(insert, Math.min(delete, replace));
	}
}
