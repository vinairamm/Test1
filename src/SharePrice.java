
public class SharePrice {

	public static int maxProfit(int price[]) {
		int maxprofit = 0;
		for (int i = 0; i < price.length - 1; i++) {
			for (int j = 0; j < price.length; j++) {

				int profit = price[j] - price[i];

				if (profit > maxprofit) {
					maxprofit = profit;
				}
			}
		}
		return maxprofit;

	}

	public static void main(String[] args) {

		int price[] = { 7, 1, 5, 3, 6, 4 };

		int n = maxProfit(price);
		System.out.println(n);

	}

}
