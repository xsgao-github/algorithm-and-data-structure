package ads.java.leetcode;

public class LC0121BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int maxProfit = 0;
		int minPrice = prices[0];
		int tmp = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				// min price - buy
				minPrice = prices[i];
			} else {
				// greater than min - sell
				tmp = prices[i] - minPrice;
				maxProfit = tmp > maxProfit ? tmp : maxProfit;
			}
		}
		return maxProfit;
	}
}