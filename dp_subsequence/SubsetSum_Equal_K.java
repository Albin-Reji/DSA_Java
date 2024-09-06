package dp_subsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum_Equal_K {

	public static void main(String[] args) {
		int arr[] = {0,1,3};
		int target=4;
		System.out.println(isSubsetSum(arr.length, arr, target));
	

	}
	static Boolean isSubsetSum(int N, int arr[], int sum){
		int dp[][]=new int[N][sum+1];
		for(int d[]:dp) {
			Arrays.fill(d, -1);
		}
        return checkTarget(N-1, arr, sum, dp);
    }
	
	
	static boolean tabulationSum(int index, int arr[], int target) {
		boolean dp[][]=new boolean[arr.length+1][target+1];
		for(int i=0;i<arr.length;i++) {
			dp[i][0]=true;
		}
		dp[0][arr[0]]=true;
		for(int ind=1;ind<arr.length;ind++) {
			for(int sum=1;sum<=target;sum++) {
				boolean nottake=dp[ind-1][sum];
				boolean take=false;
				if(target>=arr[ind]) {
					take=dp[index-1][sum-arr[ind]];
				}
				dp[ind][sum]=take||nottake;
			}
		}
		return dp[arr.length-1][target];
	}
	
	static boolean checkTarget(int index, int arr[], int target, int dp[][]) {
		if(index==0) {
			return arr[index]==target;
		}
		if(target==0)return true;
		if(dp[index][target]!=-1)return dp[index][target]==0?false:true;
		boolean take=false;
		if(target>=arr[index]) {
			take=checkTarget(index-1, arr, target-arr[index], dp);
		}
		boolean nottake=checkTarget(index-1, arr, target, dp);
		dp[index][target]=(take||nottake)==true?1:0;
		return dp[index][target]==1;
	}
	static void printALl(int index, int arr[], ArrayList<Integer> currList, ArrayList<ArrayList<Integer>> finalList) {
		if(index<0) {
			finalList.add(new ArrayList<Integer>(currList));
			return;
		}
		currList.add(arr[index]);
		printALl(index-1, arr, currList, finalList);
		currList.remove(currList.size()-1);
		printALl(index-1, arr, currList, finalList);
	}
}
