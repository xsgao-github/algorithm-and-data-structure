package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class LC0238ProductOfArrayExceptItselfTest {

	@Test
	void testProductExceptSelf() {
		LC0238ProductOfArrayExceptItself obj = new LC0238ProductOfArrayExceptItself();
		assertArrayEquals(new int[] { 24, 12, 8, 6 }, obj.productExceptSelf(new int[] { 1, 2, 3, 4 }));
	}

}
