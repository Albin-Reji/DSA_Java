package Binary_Search_On_Answers;

public class MIin_Days_Make_Bouquets {
	public static void main(String[] args) {
		int[] arr = {7, 7, 7, 7, 13, 10, 10, 7};
        int k = 3;
        int m = 2;
        int day=12;
        System.out.println(roseGarden(arr, k, m, day));
	}
	
	
	public static boolean isPossible(int arr[], int k, int m, int day) {
		int n=arr.length;
		int cnt=0;
		int noOfB=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<=day) {
				cnt++;
			}
			else {
				noOfB+=(cnt/k);
				cnt=0;
			}
		}
		noOfB+=(cnt/k);
		
		return noOfB>=m;
		
	}
	public static int roseGarden(int arr[], int k, int m, int day) {
		long val=(long)m*k;
		int n=arr.length;
		if(val>n)return -1;
		int maxi=Integer.MIN_VALUE;
		int mini=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			mini=Math.min(mini, arr[i]);
			maxi=Math.max(maxi, arr[i]);
		}
		int low=mini;
		int high=maxi;
		
		while(low<=high) {
			
			int mid=low+(high-low)/2;
			if(isPossible(arr, k, m, mid)) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return low;
		
	}
}
