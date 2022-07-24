package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.TreeNode;

class LC0637AverageOfLevelsInBinaryTreeTest {

	@Test
	void testAverageOfLevels() {
		LC0637AverageOfLevelsInBinaryTree obj = new LC0637AverageOfLevelsInBinaryTree();

		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		assertIterableEquals(Arrays.asList(new Double[] { 3.00000, 14.50000, 11.00000 }), obj.averageOfLevels(root));

		root = new TreeNode(3, new TreeNode(9, new TreeNode(15), new TreeNode(7)), new TreeNode(20));
		assertIterableEquals(Arrays.asList(new Double[] { 3.00000, 14.50000, 11.00000 }), obj.averageOfLevels(root));
	}

}
