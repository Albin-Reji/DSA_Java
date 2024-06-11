package stack;

public class CelebratyProblem {

	public static void main(String[] args) {
		int matrix[][]= {
				{0,1,0},
				{0,0,0},
				{0,1,1}
		};
		System.out.println(celebrity(matrix));

	}
	public static int celebrity(int matrix[][]) {
		
		for(int i=0;i<matrix.length;i++) {
			int iscelebrity=0;
			int iseverybodyKnows=0;
			for(int j=0;j<matrix.length;j++) {
				iscelebrity+=matrix[i][j];
				iseverybodyKnows+=matrix[j][i];
			}
			if(iscelebrity==0&&iseverybodyKnows==matrix.length-1&&matrix[i][i]==0) {
				return i;
			}
		}
		return -1;
	}

}
