package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0070ClimbingStairsTest {

	@Test
	void testClimbStairs() {
		LC0070ClimbingStairs obj = new LC0070ClimbingStairs();
		assertEquals(1, obj.climbStairs(1));
		assertEquals(2, obj.climbStairs(2));
		assertEquals(3, obj.climbStairs(3));
		assertEquals(5, obj.climbStairs(4));
		assertEquals(8, obj.climbStairs(5));
		assertEquals(13, obj.climbStairs(6));
	}

}
