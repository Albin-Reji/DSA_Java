package string;

public class RemoveParenthesis {

	public static void main(String[] args) {
		String s="((()))(())";
//		int firstCmp=0;
//		int i=5;
//		s=s.substring(firstCmp+1, i);
//		System.out.println(s);
		String ans=removeOuterParentheses(s);
		System.out.println(ans);

	}
	public static String removeOuterParentheses(String s) {
		int cnt=0;
		String ans="";
		int firstCmp=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				cnt+=1;
			}
			else {
				cnt-=1;
			}
			if(cnt==0) {
				ans+=s.substring(firstCmp+1, i);
				firstCmp=i+1;
				cnt=0;
				
			}
		}
		return ans;
	}

}
