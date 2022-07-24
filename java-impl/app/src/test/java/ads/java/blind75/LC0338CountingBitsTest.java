package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0338CountingBitsTest {

	@Test
	void testCountBits() {
		LC0338CountingBits obj = new LC0338CountingBits();
		assertArrayEquals(new int[] { 0 }, obj.countBits(0));
		assertArrayEquals(new int[] { 0, 1 }, obj.countBits(1));
		assertArrayEquals(new int[] { 0, 1, 1 }, obj.countBits(2));
		assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2, 2 }, obj.countBits(6));
	}

}
