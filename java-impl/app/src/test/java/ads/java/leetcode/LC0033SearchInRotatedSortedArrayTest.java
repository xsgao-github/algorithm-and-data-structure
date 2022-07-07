package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0033SearchInRotatedSortedArrayTest {

	@Test
	void testSearch() {
		LC0033SearchInRotatedSortedArray obj = new LC0033SearchInRotatedSortedArray();
		assertEquals(0, obj.search(new int[] { 0, 1, 2, 4, 5, 6, 7 }, 0));
		assertEquals(1, obj.search(new int[] { 7, 0, 1, 2, 4, 5, 6 }, 0));
		assertEquals(2, obj.search(new int[] { 6, 7, 0, 1, 2, 4, 5 }, 0));
		assertEquals(3, obj.search(new int[] { 5, 6, 7, 0, 1, 2, 4 }, 0));
		assertEquals(4, obj.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(5, obj.search(new int[] { 2, 4, 5, 6, 7, 0, 1 }, 0));
		assertEquals(6, obj.search(new int[] { 1, 2, 4, 5, 6, 7, 0 }, 0));
		assertEquals(-1, obj.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		assertEquals(0, obj.search(new int[] { 5, 1, 3 }, 5));
	}
}
