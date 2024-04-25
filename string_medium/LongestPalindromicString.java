package string_medium;

public class LongestPalindromicString {

	public static void main(String[] args) {
		String s="abcda" ;
		System.out.println(longestPalindrome(s));
	}
	 public static  String longestPalindrome(String s) {
		 String result=""+s.charAt(0);
		 int cnt=0;
		 if (s.length()==1)return s;
		 else if(s.length()==2&&s.charAt(0)!=s.charAt(1)) return ""+s.charAt(0);
		
		 for(int i=0;i<s.length()-1;i++) {
			 for(int j=i+1;j<s.length();j++) {
				 String currentString=s.substring(i, j+1);
				 int currentStringCnt=currentString.length();
				 if(isPalindrome(currentString)) {
					 if(currentStringCnt>cnt) {
						 cnt=currentStringCnt;
						 result=currentString; 
					 }
					 
				}
			}
		}
		 return result;
	}
		 
	 
	 static boolean isPalindrome(String s) {
		 int i=0;
		 boolean isPali=true;
		 int j=s.length()-1;
		 while(i<=j) {
			 if(s.charAt(i)==s.charAt(j)) {
				 i++;
				 j--;
				 isPali=true;
			 }
			 else {
				 isPali=false;
				 return isPali;
			 }
			 
		 }
		 return isPali;
	 }

}








