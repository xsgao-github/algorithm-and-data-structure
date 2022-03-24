package ads.java_impl.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateNumber_287Test {

	@Test
	void testFindDuplicate() {
		DuplicateNumber_287 df = new DuplicateNumber_287();
		assertEquals(2, df.findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
		assertEquals(3, df.findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
	}

}
