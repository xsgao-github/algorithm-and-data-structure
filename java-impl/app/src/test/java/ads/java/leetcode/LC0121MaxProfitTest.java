package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0121MaxProfitTest {

	@Test
	void test() {
		LC0121MaxProfit obj = new LC0121MaxProfit();
		assertEquals(5, obj.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		assertEquals(0, obj.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
	}

}
