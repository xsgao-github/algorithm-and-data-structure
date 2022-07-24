package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0191NumberOf1BitsTest {

	@Test
	void testHammingWeight() {
		LC0191NumberOf1Bits obj = new LC0191NumberOf1Bits();
		assertEquals(3, obj.hammingWeight(11));
		assertEquals(31, obj.hammingWeight(-2));
	}

}
