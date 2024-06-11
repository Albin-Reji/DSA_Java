package twoPte_slidingwindow;

import java.util.HashMap;

public class LongestSubstring_WithoutRepeating {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int kDistinctChars(int k, String str) {
		int l = 0;
		int r = 0;
		int maxLen = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while (r < str.length()) {
			if (map.containsKey(str.charAt(r))) {
				map.put(str.charAt(r), map.get(str.charAt(r)) + 1);
			} else {
				map.put(str.charAt(r), 1);
			}

			if (map.size() <= k) {
				maxLen = Math.max(r - l + 1, maxLen);
			} else {
				while (map.size() > k) {
					map.put(str.charAt(l), map.get(str.charAt(l)) - 1);
					if (map.get(str.charAt(l)) == 0) {
						map.remove(str.charAt(l));
					}
					l++;

				}
			}
			r++;
		}
		return maxLen;
	}

	public static int lengthOfLongestSubstring(String input) {
		int left = 0;
		int right = 0;
		int n = input.length();
		int maxLen = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while (right < n) {
			if (map.containsKey(input.charAt(right)))
				left = Math.max(left, map.get(input.charAt(right)) + 1);
			map.put(input.charAt(right), right);
			maxLen = Math.max(maxLen, right - left + 1);
			System.out.println(input.substring(left, right + 1));
			right++;
		}
		return maxLen;
	}

}
