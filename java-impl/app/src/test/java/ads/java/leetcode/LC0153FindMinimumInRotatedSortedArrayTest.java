package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0153FindMinimumInRotatedSortedArrayTest {

	@Test
	void testFindMin() {
		LC0153FindMinimumInRotatedSortedArray obj = new LC0153FindMinimumInRotatedSortedArray();
		assertEquals(1, obj.findMin(new int[] { 3, 4, 5, 1, 2 }));
		assertEquals(0, obj.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
		assertEquals(1, obj.findMin(new int[] { 1, 3, 5, 7 }));
		assertEquals(1, obj.findMin(new int[] { 1 }));
		assertEquals(0, obj.findMin(new int[] { 1, 0 }));
		assertEquals(1, obj.findMin(new int[] { 3, 1, 2 }));
		assertEquals(1, obj.findMin(new int[] { 2, 3, 1 }));
	}

}
