package array_medium_problem;

public class Moores_Voting_algo {

	public static void main(String[] args) {
		int arr[]= {1,1,1,2,2,2,2,2,2,2};
		System.out.println(moores_voting_algo(arr));
	}
	 static int moores_voting_algo(int arr[]) {
		 int element=-1;
		 int cnt=0;
		 for(int i=0;i<arr.length;i++) {
			 if(cnt==0) {
				 element=arr[i];
				 cnt=1;
			 }
			 else if(arr[i]==element) {
				 cnt++;
			 }
			 else {
				 cnt--;
			 }
		 }
		 int Varcnt=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==element) {
				Varcnt++;
			}
		}
		if(Varcnt>(arr.length/2)) {
			return element;
		}
		else {
			return -1;
		}
	 }
}
