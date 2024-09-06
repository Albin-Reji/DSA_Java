package dp_stocks;

public class Best_Time_2_Sell {

	public static void main(String[] args) {
		int[] prices = {5, 4, 3, 2, 1};
		System.out.println(maxProfit(prices));
	}
	 public static  int maxProfit(int[] prices) {
		 int maxProfit=0;
		 int minBuy=prices[0];
		 for(int i=1;i<prices.length;i++) {
			 maxProfit=Math.max(maxProfit, prices[i]-minBuy);
			 minBuy=Math.min(prices[i], minBuy);
		 }
		 return maxProfit;
		 
	 }
	

}
