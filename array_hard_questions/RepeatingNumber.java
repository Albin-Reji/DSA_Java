package array_hard_questions;

import java.util.HashMap;

public class RepeatingNumber {

	public static void main(String[] args) {
		int arr[]= {4,2,3,2};
		MissingNumRepeatingNum(arr);

	}
	
//	optimal solution
	static void MissingNumRepeatingNum(int arr[]) {
		int n=arr.length;
		int S=0;
		int S2=0;
		int Sn=(n*(n+1))/2;
		int S2n=(n*(n+1)*(2*n+1))/6;
		for(int i=0;i<n;i++) {
			S+=arr[i];
			S2+=arr[i]*arr[i];
		}
		int val1=S-Sn;
		int val2=S2-S2n;
		val2=val2/val1;
		int x=(val1+val1)/2;
		int y=x-val1;
		System.out.println("Missing Number= "+(y+1));
		System.out.println("Repeating Number= "+(x+1));
	}
	
	
//	better solution
	static void RepeatingNum(int arr[]) {
		int n=arr.length;
		int hash[]=new int[n+1];
		for(int i=0;i<n;i++) {
			hash[arr[i]]++;
		}
		int repeating=-1;
		int misssing=-1;
		for(int i=1;i<n+1;i++) {
			if(hash[i]==2) {
				repeating=i;
			}
			if(hash[i]==0) {
				misssing=i;
			}
		}
		System.out.println("Missing Number= "+misssing);
		System.out.println("Repearing Number= "+repeating);
	}

}
