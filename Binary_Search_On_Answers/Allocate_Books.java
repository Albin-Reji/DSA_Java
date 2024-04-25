package Binary_Search_On_Answers;
import java.util.ArrayList;

public class Allocate_Books {

	public static void main(String[] args) {
		
		int arr[]= {25, 46, 28, 49, 24};
		int student=4;
		System.out.println(findpages(arr, student));
	}
	static int findpages(int arr[], int student) {
		int low=Integer.MIN_VALUE, high=0, n=arr.length;
		if(student>arr.length)return -1;
		for(int i=0;i<n;i++) {
			low=Math.max(arr[i], low);
			high+=arr[i];
		}
		while(low<=high) {
			int mid=(low+high)/2;
			int students=countStudents(arr, mid);
			if(students>student) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
		return low;
	}
	static int countStudents(int arr[], int pages) {
		int students=1;
		int n=arr.length;
		int totpages=0;
		for(int i=0;i<n;i++) {
			if(totpages+arr[i]<=pages) {
				totpages+=arr[i];
			}
			else {
				students+=1;
				totpages=arr[i];
			}
		}
		return students;
	}

}
