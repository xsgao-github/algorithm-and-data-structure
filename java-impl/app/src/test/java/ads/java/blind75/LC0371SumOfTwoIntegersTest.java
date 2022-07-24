package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0371SumOfTwoIntegersTest {

	@Test
	void testGetSum() {
		LC0371SumOfTwoIntegers obj = new LC0371SumOfTwoIntegers();
//		assertEquals(10, obj.getSum(5, 5));
//		assertEquals(0, obj.getSum(5, -5));
//		assertEquals(1, obj.getSum(5, -4));
		assertEquals(-1, obj.getSum(4, -5));
	}

}
