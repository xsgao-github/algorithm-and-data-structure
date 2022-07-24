package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0242ValidAnagramTest {

	@Test
	void testIsAnagram() {
		LC0242ValidAnagram obj = new LC0242ValidAnagram();
		assertTrue(obj.isAnagram("", ""));
		assertTrue(obj.isAnagram("anagram", "nagaram"));
		assertFalse(obj.isAnagram("rat", "car"));
		assertFalse(obj.isAnagram(null, "car"));
	}

}
