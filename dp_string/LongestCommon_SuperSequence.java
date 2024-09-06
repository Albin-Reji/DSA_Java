package dp_string;

public class LongestCommon_SuperSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String shortestCommonSupersequence(String str1, String str2) {
        int dp[][]=new int[str1.length()+1][str2.length()+1];
        dpMatrix(str1, str2, dp);
        int i=str1.length();
        int j=str2.length();
        StringBuilder s=new StringBuilder();
        while(i>0&&j>0) {
        	if(str1.charAt(i-1)==str1.charAt(j-1)) {
        		s.append(str1.charAt(i));
        		i--;
        		j--;
        	}
        	else if(dp[i-1][j]>dp[i][j-1]) {
        		s.append(str1.charAt(i));
        	}
        	else {
        		s.append(str2.charAt(j));
        	}
        }
        while(i>0) {
        	s.append(str1.charAt(i));
        	i--;
        }
        while(j>0) {
        	s.append(str2.charAt(j));
        	j--;
        }
        return s.reverse().toString();
    }
	static void dpMatrix(String s1, String s2, int [][]dp) {
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
	}

}
