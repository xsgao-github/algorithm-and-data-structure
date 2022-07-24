package ads.java.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LC0637AverageOfLevelsInBinaryTree {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> ret = new ArrayList<>();
		// BFS
		Deque<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (queue.size() > 0) {
			double sum = 0;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				// pull
				TreeNode node = queue.remove();
				// push sub nodes
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				// do business - sum
				sum += node.val;
			}
			ret.add(sum / size);
		}
		return ret;
	}

}
