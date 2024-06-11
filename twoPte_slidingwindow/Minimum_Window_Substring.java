package twoPte_slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s, t));

	}
	public static String  minWindow(String s, String t) {
        int left=0;
        int right=0;
        int startIndex=-1;
        int minLen=Integer.MAX_VALUE;
        int cnt=0;
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        for(int k=0;k<t.length();k++) {
        	map.put(t.charAt(k), map.getOrDefault(t.charAt(k), 0)+1);
        }
       for(Map.Entry<Character, Integer> entry: map.entrySet()) {
    	   System.out.println(entry.getKey()+" "+entry.getValue());
       }
        while(right<s.length()) {
        	
    		if(map.getOrDefault(s.charAt(right), 0)>0) {
        		cnt++;
        		map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)-1);
        	}
        	
        	while(cnt==t.length()) {
        		if(right-left+1<minLen) {
        			minLen=right-left+1;
        			startIndex=left;
        		}
        		map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0)+1);
        		if(map.get(s.charAt(left))>0) cnt--;
        		left++;
        	}
        	System.out.println("------------------------------------------------------");
        	for(Map.Entry<Character, Integer> entry: map.entrySet()) {
         	   System.out.println(entry.getKey()+" "+entry.getValue());
            }
        	right++;
        	System.out.println("------------------------------------------------------");
        	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
         	   System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
        return startIndex==-1?" ":s.substring(startIndex, startIndex+minLen);
        
    }
	
}
