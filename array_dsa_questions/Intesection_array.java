package array_dsa_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Intesection_array {

	public static void main(String[] args) {
		int arr1[]= {1,2,2,3,3,4,5,6};
		int arr2[]= {2,3,3,5,6,6,7};
		ArrayList<Integer> intersection_res=intersection(arr1, arr2);
		for(int num :intersection_res) {
			System.out.print(num+" ");
		}

	}
	
	
	static ArrayList<Integer> intersection(int arr1[], int arr2[]){
		ArrayList<Integer> intersection_array=new ArrayList<>();
		int first_size=arr1.length-1;
		int second_size=arr2.length-1;
		int i=0;
		int j=0;
		while(i<=first_size&&j<=second_size) {
			if(arr1[i]!=arr2[j]) {
				i++;
			}
			else {
				if(arr1[i]==arr2[j]) {
					intersection_array.add(arr1[i]);
					i++;
					j++;
				}
				
			}
		
		}
		return intersection_array;
	}

}
