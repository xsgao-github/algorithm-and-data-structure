package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.LC0380InsertDeleteGetRandom.RandomizedSet;

class LC0380InsertDeleteGetRandomTest {

	@Test
	void test() {
		// case 1
		// ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
		// [[],[1],[2],[2],[],[1],[2],[]]
		RandomizedSet obj = new RandomizedSet();
		assertTrue(obj.insert(1));
		assertFalse(obj.remove(2));
		assertTrue(obj.insert(2));
		int r = obj.getRandom();
		System.out.println(r);
		assertTrue(r == 1 || r == 2);
		assertTrue(obj.remove(1));
		assertFalse(obj.insert(2));
		assertTrue(obj.getRandom() == 2);

		// case 2
		// ["RandomizedSet","remove","remove","insert","getRandom","remove","insert"]
		// [[],[0],[0],[0],[],[0],[0]]
		obj = new RandomizedSet();
		assertFalse(obj.remove(0));
		assertFalse(obj.remove(0));
		assertTrue(obj.insert(0));
		assertEquals(0, obj.getRandom());
		assertTrue(obj.remove(0));
		assertFalse(obj.remove(0));
	}
}
