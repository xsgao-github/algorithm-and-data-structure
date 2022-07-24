package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.TreeNode;

class LC0098ValidateBinarySearchTreeTest {

	@Test
	void testIsValidBST() {
		LC0098ValidateBinarySearchTree obj = new LC0098ValidateBinarySearchTree();
		assertFalse(obj.isValidBST(createBT(new Integer[] { 5, 1, 4, null, null, 3, 6 })));
		assertTrue(obj.isValidBST(createBT(new Integer[] { 2, 1, 3 })));
	}

	private static TreeNode createBT(Integer[] vals) {
		if (vals.length == 0) {
			return null;
		}

		// create root and push to queue
		Deque<TreeNode> queue = new LinkedList<>();
		TreeNode root = new TreeNode(vals[0]);
		queue.add(root);

		// iterate through queue
		int idx = 1;
		while (queue.isEmpty() == false && idx < vals.length) {
			// poll parent
			TreeNode n = queue.poll();
			// left
			Integer v = vals[idx++];
			if (v != null) {
				TreeNode left = new TreeNode(v);
				n.left = left;
				queue.add(left);
			}
			// right
			v = vals[idx++];
			if (v != null) {
				TreeNode right = new TreeNode(v);
				n.right = right;
				queue.add(right);
			}
		}

		// return root
		return root;
	}

}
