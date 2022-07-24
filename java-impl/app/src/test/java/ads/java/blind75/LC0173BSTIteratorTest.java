package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ads.java.blind75.LC0173BSTIterator.BSTIterator;
import ads.java.leetcode.TreeNode;

class LC0173BSTIteratorTest {

	@Test
	void test() {
		// case 1:
		// ["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next",
		// "hasNext", "next", "hasNext"]
		// [[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
		// Output
		// [null, 3, 7, true, 9, true, 15, true, 20, false]
		BSTIterator obj = new BSTIterator(
				new TreeNode(7, new TreeNode(3), new TreeNode(15, new TreeNode(9), new TreeNode(20))));
		assertEquals(3, obj.next());
		assertEquals(7, obj.next());
		assertTrue(obj.hasNext());
		assertEquals(9, obj.next());
		assertTrue(obj.hasNext());
		assertEquals(15, obj.next());
		assertTrue(obj.hasNext());
		assertEquals(20, obj.next());
		assertFalse(obj.hasNext());
	}

}
