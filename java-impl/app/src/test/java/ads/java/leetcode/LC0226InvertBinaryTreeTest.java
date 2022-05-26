package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC0226InvertBinaryTreeTest {

	@Test
	void testInvertTree() {
		LC0226InvertBinaryTree obj = new LC0226InvertBinaryTree();

		TreeNode root = TreeNode.createTree(new Integer[] { 4, 2, 7, 1, 3, 6, 9 });
		assertEquals(Arrays.asList(new Integer[] { 4, 7, 2, 9, 6, 3, 1 }), obj.invertTree(root).toValueList());

		root = TreeNode.createTree(new Integer[] { 1, null, 2, 3, null, null, 4 });
		assertEquals(Arrays.asList(new Integer[] { 1, 2, null, null, 3, 4 }), obj.invertTree(root).toValueList());

		root = TreeNode.createTree(new Integer[0]);
		assertNull(obj.invertTree(root));
	}
}
