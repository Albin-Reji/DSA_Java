package string;

import java.nio.channels.Channels;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
		
		 String s = "foo";
		 String t = "bar";
		 System.out.println(isIsomorphic(s, t));
		 
	}
	public static boolean isIsomorphic(String s, String t) {
		   String newRes="";
	       HashMap<Character, Character> strList=new HashMap<>();
	       
    	   for(int i=0;i<s.length();i++) {
    		   if(!strList.containsKey(s.charAt(i))) {
    			   if(!strList.containsValue(t.charAt(i))) {
    				   strList.put(s.charAt(i), t.charAt(i));
    			   }
    			   else {
    				   return false;
    			   }
    			   
    		   }
    		   else {
//	    			   char mappeedChar=s.charAt(i);
    			   if(strList.get(s.charAt(i))!=t.charAt(i))return false;
    		   }
    		   
    	   }
    	   return true;
	    	   
	       
	       
	 }
}
