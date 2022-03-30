package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0217ContainsSuplicateTest {

	@Test
	void testContainsDuplicate() {
		LC0217ContainsSuplicate obj = new LC0217ContainsSuplicate();
		assertTrue(obj.containsDuplicate(new int[] { 1, 2, 3, 1 }));
	}

}
