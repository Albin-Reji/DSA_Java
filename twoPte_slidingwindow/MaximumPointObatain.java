package twoPte_slidingwindow;

public class MaximumPointObatain {

	public static void main(String[] args) {
		int card[] = { 1, 2, 3, 4, 5, 6, 1 };
		int k = 3;
		System.out.println(maxScore(card, k));

	}

	public static int maxScore(int[] arr, int k) {
		int lsum = 0;
		int rsum = 0;
		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			lsum += arr[i];
		}
		maxSum = lsum;

		int right = arr.length - 1;
		for (int i = k - 1; i >= 0; i--) {
			lsum -= arr[i];
			rsum += arr[right];
			int sum = lsum + rsum;
			maxSum = sum > maxSum ? sum : maxSum;
			right--;
		}
		return maxSum;

	}

}
