package dynamic_Programming;

import java.security.Principal;
import java.util.ArrayList;

public class RecursionForDP {

	public static void main(String[] args) {
		int arr[]= {1,2,3, 5, 4};
		ArrayList<ArrayList<Integer>> ansList=printSequence(arr, 5);
		for(ArrayList<Integer> I: ansList) {
			System.out.println(I);
		}

	}
	public static ArrayList<ArrayList<Integer>> printSequence(int arr[], int k){
		ArrayList<ArrayList<Integer>> finalList=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> currList=new ArrayList<Integer>();
		getSum(finalList, currList, 0, 0, arr, k);
		return finalList;
	}

	public static boolean getSum(ArrayList<ArrayList<Integer>> finalList,ArrayList<Integer>currList, int currSum, int index, int arr[], int k) {

		if(index==arr.length) {
			if(currSum==k) {
				finalList.add(new ArrayList<Integer>(currList));
				return true;
			}
			return false;
		}
		currSum+=arr[index];
		currList.add(arr[index]);
		if(getSum(finalList, currList, currSum, index+1, arr, k)==true)return true;
		
		currSum-=arr[index];
		currList.remove(currList.size()-1);
		if(getSum(finalList, currList, currSum, index+1, arr, k)==true)return true;
		return false;
	}

}
