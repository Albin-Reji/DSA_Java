package stack;

import java.util.Arrays;


public class NxtGreaterElem_Right {

	public static void main(String[] args) {
		int arr[]= {3, 4, 2, 7, 5, 8, 10, 6};
		System.out.println(Arrays.toString(cntNxtGreaterElem(arr,4 )));

	}
	static int[] cntNxtGreaterElem(int arr[], int index) {
		int elem=arr[index];
		int startPos=arr.length;
		int cnt=0;
		for(int i =index+1;i<arr.length;i++) {
			if(elem<arr[i]) {
				if(startPos>i) {
					startPos=i;
				}
				cnt++;
			}
		}
		return new int[] {cnt,startPos};
	}

}
