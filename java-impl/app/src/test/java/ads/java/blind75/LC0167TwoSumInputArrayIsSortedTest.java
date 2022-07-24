package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0167TwoSumInputArrayIsSortedTest {

	@Test
	void testTwoSum() {
		LC0167TwoSumInputArrayIsSorted obj = new LC0167TwoSumInputArrayIsSorted();
		assertArrayEquals(new int[] { 1, 2 }, obj.twoSum(new int[] { 2, 7, 11, 15 }, 9));
	}

}
