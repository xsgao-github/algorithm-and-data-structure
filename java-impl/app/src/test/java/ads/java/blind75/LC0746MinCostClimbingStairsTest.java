package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0746MinCostClimbingStairsTest {

	@Test
	void testMinCostClimbingStairs() {
		LC0746MinCostClimbingStairs obj = new LC0746MinCostClimbingStairs();
		assertEquals(15, obj.minCostClimbingStairs(new int[] { 10, 15, 20 }));
		assertEquals(6, obj.minCostClimbingStairs(new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 }));
	}

}
