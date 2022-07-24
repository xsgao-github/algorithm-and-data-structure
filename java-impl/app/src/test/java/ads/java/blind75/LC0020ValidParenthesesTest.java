package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0020ValidParenthesesTest {

	@Test
	void testIsValid() {
		LC0020ValidParentheses obj = new LC0020ValidParentheses();
		assertTrue(obj.isValid("()[]{}"));
		assertTrue(obj.isValid("([{}])"));
		assertFalse(obj.isValid("(]"));
		assertFalse(obj.isValid("(]"));
		assertFalse(obj.isValid("[)"));
		assertFalse(obj.isValid("[}"));
		assertFalse(obj.isValid(")[]"));
	}

}
