package string_medium;

public class MaximumDepthof_Paranthesis {

	public static void main(String[] args) {
		String s = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));

	}
	public static int maxDepth(String s) {
        int cnt=0;
        int maxCnt=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='(')cnt++;
        	else if(s.charAt(i)==')')cnt--;
        	if(cnt>maxCnt)maxCnt=cnt;
        }
        return maxCnt;
    }

}
