package string_medium;

public class Sum_Beauty_Substring {

	public static void main(String[] args) {
		
		String  s="aabcbaa";
		System.out.println(beautySum(s));
		
	}
	 public static int beautySum(String s) {
		 int res=0;
	        for(int i=0;i<s.length();i++){
	        	int freq[]=new int[26];
	            for(int j=i;j<s.length();j++){
	            	freq[s.charAt(j)-'a']++;
	            	int min=getMin(freq);
	            	int max=getMax(freq);
	            	int beautyNum=max-min;
	            	
	                res+=beautyNum;
	            }
	        }
	        return res;
	       
	 }
	 static int getMax(int freq[]) {
		 int max=Integer.MIN_VALUE;
		 for(int i=0;i<26;i++) {
			 if(freq[i]!=0) {
				 max=Math.max(max, freq[i]);
			 }
		 }
		 return max;
		 
	 }
	 static int getMin(int freq[]) {
		 int min=Integer.MAX_VALUE;
		 for(int i=0;i<26;i++) {
			 if(freq[i]!=0) {
				 min=Math.min(min, freq[i]);
			 }
		 }
		 return min;
		 
	 }

}
