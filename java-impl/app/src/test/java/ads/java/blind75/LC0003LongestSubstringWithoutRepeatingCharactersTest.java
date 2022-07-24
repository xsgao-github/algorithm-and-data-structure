package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC0003LongestSubstringWithoutRepeatingCharactersTest {

	@Test
	void testLengthOfLongestSubstring() {
		LC0003LongestSubstringWithoutRepeatingCharacters obj = new LC0003LongestSubstringWithoutRepeatingCharacters();
		assertEquals(3, obj.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, obj.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, obj.lengthOfLongestSubstring("pwwkew"));
		assertEquals(2, obj.lengthOfLongestSubstring("au"));
		assertEquals(0, obj.lengthOfLongestSubstring(null));
		assertEquals(0, obj.lengthOfLongestSubstring(""));
		assertEquals(1, obj.lengthOfLongestSubstring("a"));
	}

}
