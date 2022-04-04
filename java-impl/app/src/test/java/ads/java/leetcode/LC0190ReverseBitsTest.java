package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0190ReverseBitsTest {

	@Test
	void testReverseBits() {
		LC0190ReverseBits obj = new LC0190ReverseBits();
//		assertEquals((6 << 28), obj.reverseBits(6));
		assertEquals(964176192, obj.reverseBits(43261596));
	}

}
