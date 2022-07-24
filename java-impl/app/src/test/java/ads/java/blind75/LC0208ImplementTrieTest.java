package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0208ImplementTrieTest {

	@Test
	void test() {
		LC0208ImplementTrie obj = new LC0208ImplementTrie();
		obj.insert("apple");
		assertTrue(obj.search("apple"));
		assertFalse(obj.search("app"));
		assertTrue(obj.startsWith("app"));
		obj.insert("app");
		assertTrue(obj.search("app"));
	}

}
