package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0053MaximumSubarrayTest {

	@Test
	void testMaxSubArray() {
		LC0053MaximumSubarray obj = new LC0053MaximumSubarray();
		assertEquals(6, obj.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
		assertEquals(23, obj.maxSubArray(new int[] { 5, 4, -1, 7, 8 }));
		assertEquals(-1, obj.maxSubArray(new int[] { -2, -1, -1, -3 }));
		assertEquals(1, obj.maxSubArray(new int[] { 1 }));
		assertEquals(0, obj.maxSubArray(null));
		assertEquals(0, obj.maxSubArray(new int[] {}));
	}

}
