package Binary_Search_On_Answers;

import java.util.Arrays;

public class KoKo_Eating_Banana {

	public static void main(String[] args) {
		int[] arr = {30,11,23,4,20};
        int h = 5;
        System.out.println(koko_Eating_banana(arr, h));

	}
	static int koko_Eating_banana(int piles[], int h) {
		int low=1;
		int high=findMax(piles);
//		int ans=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			double hour=findHour(piles, mid);
			if(hour<=h) {
//				ans=hour;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return low;
	}
	
	
	static int findMax(int arr[]) {
		int maxi = Integer.MIN_VALUE;;
        int n = arr.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
	}
	
	static double findHour(int arr[],int mid) {
		double totalHour=0;
		for(int i=0;i<arr.length;i++) {
			totalHour+=Math.ceil((double)(arr[i]) / (double)(mid));
		}
		return totalHour;
	}

}
