package stack;

import java.util.Stack;

public class RemoveKDigit {

	public static void main(String[] args) {
		String s = "1432219";
		int k = 3;
		System.out.println(removeKdigits(s, k));

	}
	public static String removeKdigits(String num, int k) {
		if(k==num.length())return "0";
	    Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<num.length();i++) {
        	
        	while(!stack.isEmpty()&&num.charAt(i)<stack.peek()&&k>0) {
        		stack.pop();
        		k--;
        	}
        	stack.push(num.charAt(i));

        }
       while(k>0) {
    	   stack.pop();
    	   k--;
       }
       String anString="";
       while(!stack.isEmpty()) {
    	   anString+=stack.peek();
    	   stack.pop();
       }
       
       int endingIndex=0;
       for(int i=anString.length()-1;i>=0;i--) {
    	   if(anString.charAt(i)!='0') {
    		   endingIndex=i;
    		   break;
    	   }
       }
       anString=anString.substring(0, endingIndex+1);
       StringBuilder sBuilder=new StringBuilder(anString);
       System.out.println(sBuilder);
       
       return sBuilder.reverse().toString();
    }

}
