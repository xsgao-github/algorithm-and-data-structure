package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0198HouseRobberTest {

	@Test
	void testRob() {
		LC0198HouseRobber obj = new LC0198HouseRobber();
		assertEquals(4, obj.rob(new int[] { 1, 2, 3, 1 }));
		assertEquals(12, obj.rob(new int[] { 2, 7, 9, 3, 1 }));
	}

}
