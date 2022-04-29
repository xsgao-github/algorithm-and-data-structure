package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0125ValidPalindromeTest {

	@Test
	void testIsPalindrome() {
		LC0125ValidPalindrome obj = new LC0125ValidPalindrome();
		assertTrue(obj.isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(obj.isPalindrome("0P"));
	}

}
