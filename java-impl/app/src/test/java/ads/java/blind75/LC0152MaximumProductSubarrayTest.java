package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0152MaximumProductSubarrayTest {

	@Test
	void testmaxProduct() {
		LC0152MaximumProductSubarray obj = new LC0152MaximumProductSubarray();
		for (String str : new String[] { "S", "W" }) {
			assertEquals(-2, obj.maxProduct(new int[] { -2 }, str));
			assertEquals(0, obj.maxProduct(new int[] { 0 }, str));
			assertEquals(1, obj.maxProduct(new int[] { 0, 1, 0 }, str));
			assertEquals(0, obj.maxProduct(new int[] { 0, -1, 0 }, str));
			assertEquals(1, obj.maxProduct(new int[] { 1, 0, 1 }, str));
			assertEquals(0, obj.maxProduct(new int[] { -1, 0, -1 }, str));
			assertEquals(6, obj.maxProduct(new int[] { 1, 2, 3 }, str));
			assertEquals(6, obj.maxProduct(new int[] { 1, 2, 3, 0 }, str));
			assertEquals(6, obj.maxProduct(new int[] { 0, 1, 2, 3 }, str));
			assertEquals(6, obj.maxProduct(new int[] { 0, 1, 2, 3, 0 }, str));
			assertEquals(6, obj.maxProduct(new int[] { -1, -2, -3 }, str));
			assertEquals(6, obj.maxProduct(new int[] { 0, -1, -2, -3, 0 }, str));
			assertEquals(120, obj.maxProduct(new int[] { 1, 2, 3, 0, 4, 5, 6 }, str));
			assertEquals(6, obj.maxProduct(new int[] { 2, 3, -2, 4 }, str));
			assertEquals(4, obj.maxProduct(new int[] { 3, -1, 4 }, str));
		}
	}
}
