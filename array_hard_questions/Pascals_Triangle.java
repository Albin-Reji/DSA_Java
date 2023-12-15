package array_hard_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Pascals_Triangle {

	public static void main(String[] args) {
		ArrayList<ArrayList<Long>> ans=pascal_Trinagle(5);
		for(ArrayList<Long> i :ans) {
			System.out.println(i);
		}

	}
	static ArrayList<Long> generate_row(int row) {
		long ans=1;
		ArrayList<Long> ansRow=new ArrayList<>();
		ansRow.add((long) 1);
		for(int col=1;col<row;col++) {
			ans=ans*(row-col);
			ans=ans/col;
			ansRow.add(ans);
		}
		return ansRow;
	}
	static ArrayList<ArrayList<Long>> pascal_Trinagle(int n){
		ArrayList<ArrayList<Long>> ans=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			ans.add(generate_row(i));
		}
		return ans;
		
	}

}
