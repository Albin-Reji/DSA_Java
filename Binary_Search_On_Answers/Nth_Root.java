package Binary_Search_On_Answers;

public class Nth_Root {

	public static void main(String[] args) {
		System.out.println(findNthRoot(27, 3));

	}
	static int findNthRoot(int num, int n) {
		int low=0,high=num;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			int midVal=findMidVal(mid, n, num);
			if(midVal==1) {
				return mid;
			}
			else if(midVal==2) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return -1;
	}
	
	static int findMidVal(int mid, int n, int num) {
//		return (int)Math.pow(mid, n);
		int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > num) return 2;
        }
        if (ans == num) return 1;
        return 0;
	}

}
