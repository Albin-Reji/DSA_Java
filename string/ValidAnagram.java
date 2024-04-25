package string;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
	public static boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())return false;
		int[] charCnt=new int[26];
		for(int i=0;i<s.length();i++) {
			charCnt[s.charAt(i)-'a']++;
			charCnt[t.charAt(i)-'a']--;
		}
		for (int cnt:charCnt) {
			if(cnt!=0)return false;
		}
		return true;
		
	}

}
