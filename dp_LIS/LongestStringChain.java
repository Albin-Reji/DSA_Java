package dp_LIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class StringSort implements Comparator<String>{
	public int compare(String o1, String o2 ) {
		if(o1.length()>o2.length())return 1;
		return -1;
	}
}
public class LongestStringChain {

	public static void main(String[] args) {
		String[] words = {"xbc","pcxbcf","xb","cxbc","pcxbc"};
		System.out.println(Arrays.toString(words));
		Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
		
		System.out.println(Arrays.toString(words));
		System.out.println(longestStrChain(words));

	}
	
	static boolean comapareStr(String s1, String s2) {
		if (s1.length() != s2.length() + 1) {
            return false;
        }

        int first = 0;
        int second = 0;

        while (first < s1.length()) {
            if (second < s2.length() && s1.charAt(first) == s2.charAt(second)) {
                first++;
                second++;
            } else {
                first++;
            }
        }

        return first == s1.length() && second == s2.length();
		
	}
	static int  longestStrChain(String[] words) {
		Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
		int len=0;
		int maxVal=1;
		int dp[]=new int[words.length];
		Arrays.fill(dp, 1);
        for(int ind=0;ind<words.length;ind++) {
        	for(int prev=0;prev<ind;prev++) {
        		if(comapareStr(words[ind], words[prev])&&dp[prev]+1>dp[ind]) {
        			dp[ind]=dp[prev]+1;
        		}
        	}
        	maxVal=Math.max(maxVal, dp[ind]);
        }
        return maxVal;
	}
    

}
