package ads.java.leetcode;

/**
 * @author sgao
 *
 */
public class LC0098ValidateBinarySearchTree {

	public boolean isValidBST(TreeNode root) {
		if (root.left == null && root.right == null) {
			return true;
		}

		int[] ret = validate(root);
		return ret[0] == 1;
	}

	/**
	 * Validate that max value of left is less than <tt>n.val</tt> and min value of
	 * right is greater than <tt>n.val</tt>. return the valid flat (0 or 1) and
	 * min/max value of this subtree under node <tt>n</tt>.
	 * 
	 * @param n
	 * @return
	 */
	private int[] validate(TreeNode n) {
		int[] left = null, right = null;
		int[] ret = new int[] { 0, n.val, n.val };

		// no child
		if (n.left == null && n.right == null) {
			ret[0] = 1;
			return ret;
		}

		// validate left
		if (n.left != null) {
			left = validate(n.left);
			if (left[0] == 0 || left[2] >= n.val) {
				return ret;
			}
		}

		// validate right
		if (n.right != null) {
			right = validate(n.right);
			if (right[0] == 0 || right[1] <= n.val) {
				return ret;
			}
		}

		// return valid
		ret[0] = 1;
		ret[1] = left == null ? n.val : left[1];
		ret[2] = right == null ? n.val : right[2];
		return ret;
	}

	/**
	 * Definition for a binary tree node.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
