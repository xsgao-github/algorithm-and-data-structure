package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0121BestTimeToBuyAndSellStockTest {

	@Test
	void testMaxProfit() {
		LC0121BestTimeToBuyAndSellStock obj = new LC0121BestTimeToBuyAndSellStock();
		assertEquals(5, obj.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		assertEquals(0, obj.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		assertEquals(3, obj.maxProfit(new int[] { 2, 1, 4 }));
	}

}
