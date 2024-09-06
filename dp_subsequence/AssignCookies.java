package dp_subsequence;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		

	}
	public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cookie=0;
        int maxCookie=0;
        while(cookie<s.length&&child<g.length) {
        	if(g[child]<=s[cookie]) {
        		maxCookie++;
        		child++;
        		cookie++;
        	}
        	else {
        		cookie++;
        	}
        }
        return maxCookie;
    }

}
