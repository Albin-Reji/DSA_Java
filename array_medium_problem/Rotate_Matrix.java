package array_medium_problem;

import java.util.Arrays;

public class Rotate_Matrix {

	public static void main(String[] args) {
		int[][] arr= {
				{1,5,9,13},
				{2,6,10,14},
				{3,7,11,15},
				{4,8,12,16}
		};
		rotateMatrix(arr);

	}
	static void rotateMatrix(int arr[][]) {
//		initial 2d array
		System.out.println("Initial Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		transpose of matrix
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				arr[i][j]=arr[j][i];
			}
		}
		System.out.println("Transpose Array");
//		printing transpose
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		swap one array
		for(int i=0;i<arr.length;i++) {
			swap(arr[i], 0, arr.length-1);
		}
		System.out.println("Rotate Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	static void swap(int arr[], int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
