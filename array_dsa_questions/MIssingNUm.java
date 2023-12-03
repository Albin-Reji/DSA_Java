package array_dsa_questions;

public class MIssingNUm {

	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,7,8,9,10};
//		System.out.println(missingNum(arr));
//		System.out.println(Missingnum2(arr));
		
	}
	static int missingNum(int arr[]) {
		int n=arr[arr.length-1];
		int sum_of_natural_num=n*(n+1)/2;
		int sum_arr=0;
		for(int i:arr) {
			sum_arr+=i;
		}
		int ans=sum_of_natural_num-sum_arr;
		return ans;
	}
	static int Missingnum2(int arr[]) {
		int xor1=0;
		int xor2=0;
		for(int i=1;i<arr.length;i++) {
			xor1=xor1^i;
		}
		for(int i=0;i<arr.length;i++) {
			xor2=xor2^arr[i];
		}
		int ans=xor1^xor2;
		return ans+1;
	}
}
