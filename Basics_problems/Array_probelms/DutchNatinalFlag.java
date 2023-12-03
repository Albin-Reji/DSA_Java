package Array_probelms;
import java.util.Arrays;

public class DutchNatinalFlag {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		System.out.println(Arrays.toString(arr));
		dnf(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void dnf(int arr[]) {
		int low =0;
		int temp;
		int mid=0;
		int high=arr.length-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr, low,mid);
				low++;
				mid++;
			}
			else if(arr[mid]==1)
				mid++;
			else if(arr[mid]==2) {
				swap(arr, mid, high);
				high--;
			}
		}
	}
	static void swap(int arr[],int low, int high) {
		int temp;
		temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;		
		
	}

}
