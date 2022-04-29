package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0217ContainsDuplicateTest {

	@Test
	void testContainsDuplicate() {
		LC0217ContainsDuplicate obj = new LC0217ContainsDuplicate();
		assertTrue(obj.containsDuplicate(new int[] { 1, 2, 3, 1 }));
	}

}
