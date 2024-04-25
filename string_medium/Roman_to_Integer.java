package string_medium;

import java.util.HashMap;

public class Roman_to_Integer {

	public static void main(String[] args) {
		String s = "III";
		System.out.println(romanToInt(s));

	}
	public static  int romanToInt(String s) {
		HashMap<Character, Integer> symbolValueMap = new HashMap<>();
		int result=0;
        
        // Add symbol-value pairs to the HashMap
        symbolValueMap.put('I', 1);
        symbolValueMap.put('V', 5);
        symbolValueMap.put('X', 10);
        symbolValueMap.put('L', 50);
        symbolValueMap.put('C', 100);
        symbolValueMap.put('D', 500);
        symbolValueMap.put('M', 1000); 
        for(int i=0;i<s.length()-1;i++) {
        	if(symbolValueMap.get(s.charAt(i))>=symbolValueMap.get(s.charAt(i+1))) {
        		result+=symbolValueMap.get(s.charAt(i));
        	}
        	else {
        		result-=symbolValueMap.get(s.charAt(i));
        	}
        }
        result+=symbolValueMap.get(s.charAt(s.length()-1));
        return result;
	}

}
