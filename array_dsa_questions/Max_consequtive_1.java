package array_dsa_questions;

public class Max_consequtive_1 {
	public static void main(String args[]) {
//		int arr[]= {1,1,1,2, 1,1,1,1,10, 2,2,3,4};
//		System.out.println(max_1(arr));
		int arr[]= {1,1,2,3,3,4,4};
		System.out.println(num_appear_1(arr));
	}
	
	static int num_appear_1(int arr[]) {
		int xor_ans=0;
		for(int i :arr) {
			xor_ans=xor_ans^i;
		}
		return xor_ans;
	}
	
	
	
	static int max_1(int arr[]) {
		int cnt=0;
		int max=0;
		for(int i :arr) {
			if(i==1) {
				cnt++;
			}
			else {
				if(cnt>max) {
					max=cnt;
					cnt=0;
				}
			}
			
			
		}
		return max;
	}
}
