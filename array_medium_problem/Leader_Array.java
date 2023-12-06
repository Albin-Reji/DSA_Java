package array_medium_problem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leader_Array {

	public static void main(String[] args) {
		int arr[]= {10,22,23,12,3,0,1};
		ArrayList<Integer> ans=list_leader(arr);
		System.out.println(ans);

	}
	static ArrayList<Integer> list_leader(int arr[]){
		int max;
		
		ArrayList<Integer> leaderlist=new ArrayList<>();
		leaderlist.add(arr[arr.length-1]);
		for(int i=arr.length-1;i>=0;i--) {
			int leader=leaderlist.get(leaderlist.size()-1);
			if(arr[i]>leader) {
				leaderlist.add(arr[i]);
			}
		}
//		Collections.sort(leaderlist, Collections.reverseOrder());
		return leaderlist;
	}

}
