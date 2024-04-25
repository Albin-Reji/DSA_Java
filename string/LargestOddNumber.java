package string;

public class LargestOddNumber {

	public static void main(String[] args) {
		String num="544444";
		System.out.println(largestOddNumber(num));
	}
	public static String largestOddNumber(String num) {
        String result="";
        for(int i=num.length()-1;i>=0;i--) {
        	if((int)num.charAt(i)%2!=0)return num.substring(0, i+1);
        }
        return num;
    }

}
