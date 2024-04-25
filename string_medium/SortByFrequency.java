package string_medium;

import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {

	public static void main(String[] args) {
		String s = "hello";
		frequencySort(s);
	}
	 public static void frequencySort(String s) {
		 HashMap<Character, Integer>freqCnt=new HashMap<>();
		 int cnt=0;
		 for(int i=0;i<s.length();i++) {
//			 not contain thet key add to the freqcnt
			 if(!freqCnt.containsKey(s.charAt(i))) {
				 cnt=1;
				 freqCnt.put(s.charAt(i), cnt);
			 }
			 else {
				 cnt=freqCnt.get(s.charAt(i))+1;
				 freqCnt.put(s.charAt(i), cnt);
			 }
		 }
		 for(Map.Entry<Character, Integer> entry:freqCnt.entrySet()) {
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
	        
	 }
//	 static void freqCntSort(HashMap<Character, Integer> freqCnt) {
//		 
//	 }

}
