package linearSearch;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,3,2,4,7,6,5,8,9,4,5,-1};
		System.out.println(linearsearch(a, -9));

	}
	//return index if element present in the array
	static int linearsearch(int arr[], int target) {
		if (arr.length==0)
			return -1;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==target)
				return i;
		}
		return -1;
		
	}
	//return true or false if element present in the array
	static boolean linearsearch1(int arr[], int target) {
		if (arr.length==0)
			return false;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==target)
				return true;
		}
		return false;
		
	}

}
