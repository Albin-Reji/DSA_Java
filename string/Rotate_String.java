package string;

public class Rotate_String {

	public static void main(String[] args) {
		String s="abcde";
		String goal = "cdebb";
		System.out.println(rotateString(s, goal));

	}
	public static boolean rotateString(String s, String goal) {
        String CurrStr=s+s;
        if(CurrStr.contains(goal))return true;
        return false;
        
        
    }

}
