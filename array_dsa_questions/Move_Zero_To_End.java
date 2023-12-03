package array_dsa_questions;

import java.util.Arrays;

public class Move_Zero_To_End {

	public static void main(String[] args) {
		int arr[]= {1,0,2,3,0,6,0,7,8};
		System.out.println(Arrays.toString(move_0_toend(arr)));

	}
	static int[] move_0_toend(int arr[]) {
		int j=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
			
		}
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		return arr;
	}
	
	

}
