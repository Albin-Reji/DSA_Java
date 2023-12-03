package linearSearch;

public class SumDiagonal {

	public static void main(String[] args) {
		int mat[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println(diagonalSum(mat));
		

	}
	public static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int j=n-1;
        int sum=0;
        if (n==1)
            return mat[0][0];
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i]+mat[i][j];
            j=j-1;
        }
        return sum;
    }

}
