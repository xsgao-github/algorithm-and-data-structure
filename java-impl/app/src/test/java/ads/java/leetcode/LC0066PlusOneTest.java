package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0066PlusOneTest {

	@Test
	void test() {
		LC0066PlusOne obj = new LC0066PlusOne();
		assertArrayEquals(new int[] { 1, 2, 4 }, obj.plusOne(new int[] { 1, 2, 3 }));
		assertArrayEquals(new int[] { 4, 3, 2, 2 }, obj.plusOne(new int[] { 4, 3, 2, 1 }));
		assertArrayEquals(new int[] { 2, 0 }, obj.plusOne(new int[] { 1, 9 }));
		assertArrayEquals(new int[] { 1, 0, 0 }, obj.plusOne(new int[] { 9, 9 }));
	}

}
