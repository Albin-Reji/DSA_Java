package stack;

import java.util.Stack;

public class InfixPostFix_Expression {

	public static void main(String[] args) {
		 String exp = "A*(B+C)/D";
		 System.out.println(infixToPostfix(exp));

	}
	public static String infixToPostfix(String exp) {
		String res="";
       Stack<Character> st=new Stack<Character>();
       for(int i=0;i<exp.length();i++) {
    	   if(st.isEmpty()) {
    		   st.push(exp.charAt(i));
    	   }
    	   if(Character.isLetterOrDigit(exp.charAt(i))) {
    		   res+=exp.charAt(i);
    	   }
    	   else if(exp.charAt(i)=='(') {
    		   st.push(exp.charAt(i));
    	   }
    	   else if(!st.isEmpty()&&exp.charAt(i)==')') {
    		   while(st.peek()!='(') {
    			   res+=st.peek();
    			   st.pop();
    		   }
    	   }
    	   else {
    		   while(!st.isEmpty()&&prec(exp.charAt(i))<=prec(st.peek())) {
    			   res+=st.pop();
    		   }
    		   st.push(exp.charAt(i));
    		   
    	   }
  
       }
       while(!st.isEmpty()) {
    	   if(st.peek()=='(') {
    		   res+=st.peek();
    	   }
    	   st.pop();
       }
       return res;
       
     }
	static int prec(char ch) {
		switch (ch) {
		case '+': 
		case'-':{
			
			return 1;
		}
		case '*': 
		case'/':{
			
			return 2;
		}
		case '^':
			return 3;	
		}
		return -1;
	}

}
