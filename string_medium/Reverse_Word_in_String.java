package string_medium;

public class Reverse_Word_in_String {

	public static void main(String[] args) {
		String s="  Hello world  ";
		System.out.println(reverseWords(s));

	}
	
	public static String reverseWords(String s) {
		 String str[]=s.trim().split("\\s+");
		 String finRes="";
		 for(int i=str.length-1;i>=0;i--) {
             if(i!=0){
                 finRes+= str[i]+" ";
                 System.out.println("|"+finRes+"|");
             }
             else{
                 finRes+= str[i];
                 System.out.println("|"+finRes+"|");
             }
             
			
		 }
		 System.out.println("________________________________");
		 String finalRes=finRes;
		 return finalRes;
		 
	 }
	
	
//	reverse by using dot 
	
	 public static String DotreverseWords(String s) {
		 int startPtr=0;
		 String finalRes="";
		 int k=0;
		 while(s.charAt(k)==' ') {
			 k++;
		 }
		 for(int i=k;i<s.length();i++) {
			if(s.charAt(i)=='.'||i==s.length()-1) {
				if(s.charAt(i)=='.') {
					String tempres= stringReverse(s.substring(startPtr, i));
					finalRes+=tempres;
					finalRes+=".";
					startPtr=i+1;
				}
				else {
					String tempres= stringReverse(s.substring(startPtr, i+1));
					finalRes+=tempres;
					startPtr=i+1;
				}
				
			}
		 }
		 String finRes=stringReverse(finalRes);
		 
		return finalRes;
	 }
	 static String stringReverse(String s) {
		 String res="";
		 for(int i=s.length()-1;i>=0;i--) {
			 res+=s.charAt(i);
		 }
		 
		 return res;
	 }

}
