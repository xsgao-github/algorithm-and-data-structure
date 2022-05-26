package ads.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LC0226InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode tmp = null;
		TreeNode n = null;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (queue.size() > 0) {
			// pull from head
			n = queue.remove();
			// add children
			if (n.left != null) {
				queue.add(n.left);
			}
			if (n.right != null) {
				queue.add(n.right);
			}
			// swap children
			tmp = n.left;
			n.left = n.right;
			n.right = tmp;
		}

		return root;
	}
}
