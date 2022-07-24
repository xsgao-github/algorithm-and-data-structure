package ads.java.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return String.valueOf(this.val);
	}

	public static TreeNode createTree(Integer... vals) {
		if (vals.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(vals[0]);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int index = 1;
		TreeNode n = null;
		TreeNode tmp = null;

		while (index < vals.length) {
			n = queue.remove();
			if (n == null) {
				continue;
			}

			tmp = null;
			if (vals[index] != null) {
				tmp = new TreeNode(vals[index]);
			}
			n.left = tmp;
			queue.add(tmp);
			index++;

			tmp = null;
			if (index < vals.length && vals[index] != null) {
				tmp = new TreeNode(vals[index]);
			}
			n.right = tmp;
			queue.add(tmp);
			index++;
		}

		return root;
	}

	public List<Integer> toValueList() {
		List<Integer> l = new ArrayList<>();

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(this);
		TreeNode n = null;

		while (queue.size() > 0) {
			n = queue.remove();
			l.add(n == null ? null : n.val);

			if (n != null) {
				queue.add(n.left);
				queue.add(n.right);
			}
		}
		
		// remove trailing null
		for (int i = l.size() - 1; i >= 0; i--) {
			if (l.get(i) == null) {
				l.remove(i);
			} else {
				break;
			}
		}

		return l;
	}
}
