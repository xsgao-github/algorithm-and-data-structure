package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0287DuplicateNumberTest {

	@Test
	void testFindDuplicate() {
		LC0287DuplicateNumber df = new LC0287DuplicateNumber();
		assertEquals(2, df.findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
		assertEquals(3, df.findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
		assertEquals(2, df.findDuplicate(new int[] { 2, 2, 2, 2, 2 }));
	}
}
