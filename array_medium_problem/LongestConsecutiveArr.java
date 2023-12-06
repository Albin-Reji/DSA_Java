package array_medium_problem;
import java.util.*;

public class LongestConsecutiveArr {

	public static void main(String[] args) {
		int arr[]= {5,8,7,3,2,1,4,};
		System.out.println(optimallongconcecutive(arr));

	}
	static int optimallongconcecutive(int arr[]) {
		int n=arr.length;
		if(n==0) {
			return 0;
		}
		int longest=1;
		Set<Integer> st=new HashSet<>();
		for(int i=0;i<n;i++) {
			st.add(arr[i]);
		}
		for(int it:st) {
			if(!st.contains(it-1)) {
				int cnt=1;
				int x=it;
				while (st.contains(x+1)) {
					cnt+=1;
					x=x+1;
					
				}
				longest=Math.max(longest, cnt);
			}
		}
		
		
		return longest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int betterlongestConsecutive(int arr[]) {
		Arrays.sort(arr);
		int last_Smallest=-1000;
		int longest=1;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-1==last_Smallest) {
				cnt+=1;
				last_Smallest=arr[i];
			}
			else if(arr[i]!=last_Smallest) {
				cnt=1;
				last_Smallest=arr[i];
			}
			longest=Math.max(longest, cnt);
		}
		
		return longest;
		
	}

}
