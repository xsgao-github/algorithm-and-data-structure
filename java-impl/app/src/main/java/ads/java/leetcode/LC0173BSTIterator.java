package ads.java.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class LC0173BSTIterator {
	/**
	 * Your BSTIterator object will be instantiated and called as such:
	 * 
	 * <pre>
	 * BSTIterator obj = new BSTIterator(root);
	 * int param_1 = obj.next();
	 * boolean param_2 = obj.hasNext();
	 * </pre>
	 */
	public static class BSTIterator {
		Deque<TreeNode> stack = new LinkedList<>(); 

		public BSTIterator(TreeNode root) {
			if (root == null) {
				return;
			}
			pushSubTree(root);
		}

		/**
		 * push left side of a tree into queue (numbers are in descending order)
		 * @param n
		 */
		private void pushSubTree(TreeNode n) {
			stack.push(n);
			while ((n = n.left) != null) {
				stack.push(n);
			}
		}

		public int next() {
			TreeNode ret = stack.pop();

			if (ret.right != null) {
				// push right side sub tree
				pushSubTree(ret.right);
			}
			return ret.val;
		}

		public boolean hasNext() {
			return stack.size() > 0;
		}
	}
}
