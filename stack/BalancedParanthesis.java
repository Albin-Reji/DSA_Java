package stack;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		
		String s="()";
		System.out.println(isValid(s));
	}
	public static  boolean isValid(String s) {
		if(s.length()<2)return false;
		Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++) {
        	char currString=s.charAt(i);
        	if(currString=='('||currString=='{'||currString=='[') {
        		stack.push(currString);
        	}
        	else {
        		if(stack.isEmpty()) {
        			return false;
        		}
        		char popstring=stack.pop();
        		if(currString==')'&&popstring=='('||currString=='}'&&popstring=='{'||currString==']'&&popstring=='[') {
        			
        		}
        		else {
        			return false;
        		}
        	}
        }
        if(stack.size()==0)return true;
        return false;
    }

}
