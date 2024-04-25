package string_medium;import java.nio.channels.Channels;

public class Atoi {

	public static void main(String[] args) {
		String s = "-91283472332";
		System.out.println(myAtoi(s));
//		System.out.println('1'-'0');
	}
	public static int myAtoi(String s) {
		if(s.length()==0)return 0;
		int i=0;
		while(s.charAt(i)==' ') {
			i++;
		}
		s=s.substring(i);
		i=0;
		System.out.println(s);
		int sign=+1;
		int  ans=0;
		if(s.charAt(i)=='-') {
			sign=-1;
			i++;
			
		}
		else if(s.charAt(i)=='+') {
			sign=1;
			i++;
			
		}
		
		while(i<s.length()&&Character.isDigit(s.charAt(i))) {
			ans=(ans*10)+(s.charAt(i)-'0');
			i++;
		}
		if(sign== -1&&Integer.MIN_VALUE<-1*ans) return Integer.MIN_VALUE;
	    if(sign== 1 &&Integer.MAX_VALUE>ans) return Integer.MAX_VALUE;
		
        
		return sign*ans;
	        
	}

}
