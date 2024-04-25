package Binary_Search_On_Answers;

public class Sqrt_Of_Integer {

	public static void main(String[] args) {
		
		System.out.println(findSqrt(8));
	}
	static int findSqrt(int num) {
		int low=0;
		int ans=-1;
		int high=num;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid*mid>num) {
				high=mid-1;
			}
			else {
				ans=mid;
				low=mid+1;
			}
		}
		return ans;
	}

}
