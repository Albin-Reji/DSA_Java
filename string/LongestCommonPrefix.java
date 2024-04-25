package string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs={"flower","flow","flag","flight"};
//		String[] strs= {"dog","racecar","car"};
//		String 
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		String res="";
		Arrays.sort(strs);
		String first=strs[0];
		String last=strs[strs.length-1];
		for(int i=0;i<first.length();i++) {
			if(first.charAt(i)==last.charAt(i))res+=first.charAt(i);
			else return res;
			
		}
		return res;
    }

}
