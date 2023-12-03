package array_dsa_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Second_largest {

	public static void main(String[] args) {
		
//		int arr[]= {1,4,3,2,5};
		int arr[]= {1,2, 2,4, 4, 5, 5};
//		System.out.println(second_largest(arr));
//		System.out.println(is_sorted(arr));
//		Set<Integer> setlist=remove_duplicates(arr);
//		for(int i :setlist) {
//			System.out.println(i);
//		}
//		System.out.println(Arrays.toString());
		remove_duplicate(arr);
	}
	
//	Remove Duplicates from array
	static Set<Integer> remove_duplicates(int arr[]) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
			
		}
		return set;
	}
//	or
	static void remove_duplicate(int arr[]) {
		arr[0]=arr[0];
		int i=0;
		int j=i+1;
		while(j!=arr.length-1) {
			if(arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
				i++;
			}
			else {
				j++;
			}
		}
		for(int k=0;k<=i;k++) {
			System.out.println(arr[k]);
		}
	}
	

//	Second largest element in an array
	static int second_largest(int arr[]) {
		int largest=arr[0];
		int secondLargest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
				
			}
		}
		return secondLargest;
	}
//	Check if array is sorted
	static boolean is_sorted(int arr[]) {
		for(int i=0;i<arr.length-1; i++) {
			if(arr[i]<=arr[i+1]) {
			
			}
			else {
				return false;
			}
		}
		return true;
	}

}
