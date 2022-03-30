package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0011ContainerWithMostWaterTest {

	@Test
	void testMaxArea() {
		LC0011ContainerWithMostWater obj = new LC0011ContainerWithMostWater();
		assertEquals(49, obj.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		assertEquals(49, obj.maxArea(new int[] { 1, 1 }));
	}

}
