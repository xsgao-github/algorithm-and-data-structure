package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class LC0001TwoSumTest extends LC0001TwoSum {

	@Test
	void testTwoSum() {
        LC0001TwoSum obj = new LC0001TwoSum();
        assertArrayEquals(new int [] {0, 1}, obj.twoSum(new int[] { 2, 7, 11, 15 }, 9));
        assertArrayEquals(new int [] {1, 2}, obj.twoSum(new int[] { 3, 2, 4 }, 6));
        assertArrayEquals(new int [] {0, 1}, obj.twoSum(new int[] { 3, 3 }, 6));
	}

}
