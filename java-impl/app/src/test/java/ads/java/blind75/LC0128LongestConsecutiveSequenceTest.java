package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0128LongestConsecutiveSequenceTest {

	@Test
	void test() {
		LC0128LongestConsecutiveSequence obj = new LC0128LongestConsecutiveSequence();
		assertEquals(4, obj.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
	}

}
