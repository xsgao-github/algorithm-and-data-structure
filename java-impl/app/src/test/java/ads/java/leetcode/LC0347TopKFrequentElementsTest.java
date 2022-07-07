package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0347TopKFrequentElementsTest {

	@Test
	void testTopKFrequent() {
		LC0347TopKFrequentElements obj = new LC0347TopKFrequentElements();
		assertArrayEquals(new int[] { 1, 2 }, obj.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
		assertArrayEquals(new int[] { 1 }, obj.topKFrequent(new int[] { 1 }, 1));
	}

}
