package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ListNodeTest {

	@Test
	void testCreateList() {
		TreeNode root = TreeNode.createTree(1, 2, 3);
		assertEquals(1, root.val);
		assertEquals(2, root.left.val);
		assertEquals(3, root.right.val);
		assertNull(root.left.left);
		assertNull(root.left.right);

		root = TreeNode.createTree(1, null, 2, 3, null, null, 4);
		assertEquals(1, root.val);
		assertNull(root.left);
		assertEquals(2, root.right.val);
		assertEquals(3, root.right.left.val);
		assertNull(root.right.right);
		assertNull(root.right.left.left);
		assertEquals(4, root.right.left.right.val);

		root = TreeNode.createTree();
		assertNull(root);
	}

	@Test
	void testToValueList() {
		Integer[] input = new Integer[] { 1, 2, 3 };
		assertEquals(Arrays.asList(input), TreeNode.createTree(input).toValueList());

		input = new Integer[] { 1, null, 2, 3, null, null, 4 };
		assertEquals(Arrays.asList(input), TreeNode.createTree(input).toValueList());
	}
}
