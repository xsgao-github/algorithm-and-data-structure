package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0600NonNegativeIntegersWithoutConsecutiveOnesTest {

	@Test
	void testFindIntegers() {
		LC0600NonNegativeIntegersWithoutConsecutiveOnes obj = new LC0600NonNegativeIntegersWithoutConsecutiveOnes();
		assertEquals(1, obj.findIntegers(0));
		assertEquals(2, obj.findIntegers(1));
		assertEquals(5, obj.findIntegers(5));
		assertEquals(13, obj.findIntegers(22));
	}

}
