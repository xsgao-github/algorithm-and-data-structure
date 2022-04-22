package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0213HouseRobberIITest {

	@Test
	void testRob() {
		LC0213HouseRobberII obj = new LC0213HouseRobberII();
//		assertEquals(3, obj.rob(new int[] { 2, 3, 2 }));
//		assertEquals(4, obj.rob(new int[] { 1, 2, 3, 1 }));
//		assertEquals(3, obj.rob(new int[] { 1, 2, 3 }));
		assertEquals(103, obj.rob(new int[] { 1, 3, 1, 3, 100 }));
	}

}
