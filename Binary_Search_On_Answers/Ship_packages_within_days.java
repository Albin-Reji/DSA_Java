package Binary_Search_On_Answers;

public class Ship_packages_within_days {
//leaast capacity within d days
	public static void main(String[] args) {
		int arr[]= {5, 4, 5, 2, 3, 4, 5, 6};
		int capacity=15;
		int day=5;
		System.out.println(minCapacity(arr, day));

	}
	public static int findDays(int arr[], int capacity) {
		int n=arr.length;
		int load=0,day=1;
		for(int i=0;i<n;i++) {
			if(load+arr[i]>capacity) {
				day+=1;
				load=arr[i];
			}
			else {
				load+=arr[i];
				
			}
		}

		return day;
	}
	static int minCapacity(int arr[], int day) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			max=Math.max(max, arr[i]);
		}
		int low=max;
		int high=sum;
		while(low<=high) {
			int mid=(low+high)/2;
			int returnDays=findDays(arr, mid);
			if(returnDays<=day) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return low;
	}

}
