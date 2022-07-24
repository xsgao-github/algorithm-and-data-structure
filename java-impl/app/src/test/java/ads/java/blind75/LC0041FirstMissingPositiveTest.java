package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0041FirstMissingPositiveTest {

	@Test
	void testFirstMissingPositive() {
        LC0041FirstMissingPositive obj = new LC0041FirstMissingPositive();
        assertEquals(2, obj.firstMissingPositive(new int[] { 1 }));
        assertEquals(2, obj.firstMissingPositive(new int[] { 1, 1 }));
        assertEquals(3, obj.firstMissingPositive(new int[] { 1, 2, 0 }));
        assertEquals(3, obj.firstMissingPositive(new int[] { 0, 1, 2 }));
        assertEquals(2, obj.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
        assertEquals(1, obj.firstMissingPositive(new int[] { 7, 8, 9, 11, 12 }));
	}

}
