package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC202HappyNumberTest {

	@Test
	void test() {
		LC202HappyNumber obj = new LC202HappyNumber();
		assertTrue(obj.isHappy(19));
		assertFalse(obj.isHappy(2));
	}

}
