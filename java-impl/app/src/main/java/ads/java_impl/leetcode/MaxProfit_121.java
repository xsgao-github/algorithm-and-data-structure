package ads.java_impl.leetcode;

public class MaxProfit_121 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];
        int tmp = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] < minPrice) {
                minPrice = prices[i - 1];
            }
            tmp = prices[i] - minPrice;
            maxProfit = tmp > maxProfit ? tmp : maxProfit;
        }
        return maxProfit;
    }

    public static void main(String... args) {
        MaxProfit_121 mp = new MaxProfit_121();
        System.out.println(5 == mp.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
        System.out.println(0 == mp.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
    }
}