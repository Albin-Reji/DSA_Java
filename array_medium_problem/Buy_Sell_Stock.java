package array_medium_problem;

public class Buy_Sell_Stock {

	public static void main(String[] args) {
		int arr[]= {7,1,5,3,8,4, 9};
		System.out.println(buy_sell(arr));

	}
	static int buy_sell(int arr[]) {
		int max_profit=0;
		int buy=arr[0];
		int sell;
		int profit;
		for(int i=1;i<arr.length;i++) {
			sell=arr[i];
			profit=sell-buy;
			max_profit=Math.max(max_profit, profit);
			buy=Math.min(buy, arr[i]);
		}
		return max_profit;
	}

}
