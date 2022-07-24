package ads.java.blind75;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LC0133CloneGraph {
	public Node cloneGraph(Node node) {
		if (node == null) {
			return null;
		}

		Map<Integer, Node> oldNodes = new HashMap<>();
		Map<Integer, Node> newNodes = new HashMap<>();

		// clone nodes
		cloneNodes(oldNodes, newNodes, node);
		// set relationship
		addEdges(oldNodes, newNodes);

		return newNodes.get(1);
	}

	private void cloneNodes(Map<Integer, Node> oldNodes, Map<Integer, Node> newNodes, Node node) {
		Deque<Node> queue = new LinkedList<>();
		Set<Node> visited = new HashSet<>();
		queue.add(node);
		visited.add(node);
		while (queue.size() > 0) {
			Node n = queue.poll();
			Node n1 = new Node(n.val);
			oldNodes.put(n.val, n);
			newNodes.put(n1.val, n1);
			n.neighbors.stream().forEach((e) -> {
				if (visited.contains(e) == false) {
					queue.add(e);
					visited.add(e);
				}
			});
		}
	}

	private void addEdges(Map<Integer, Node> oldNodes, Map<Integer, Node> newNodes) {
		for (Map.Entry<Integer, Node> entry : oldNodes.entrySet()) {
			Node n = newNodes.get(entry.getKey());
			entry.getValue().neighbors.stream().forEach((e) -> {
				n.neighbors.add(newNodes.get(e.val));
			});
		}
	}

	static class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
			val = 0;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val) {
			val = _val;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val, ArrayList<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}

//		@Override
//		public int hashCode() {
//			return Objects.hash(val);
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Node other = (Node) obj;
//			return val == other.val;
//		}
//
//		@Override
//		public String toString() {
//			return String.valueOf(this.val);
//		}

		public String printGraph() {
			StringBuilder sb = new StringBuilder();

			Deque<Node> queue = new LinkedList<>();
			Set<Node> visited = new HashSet<>();
			queue.add(this);
			visited.add(this);
			while (queue.size() > 0) {
				Node n = queue.poll();
				if (sb.length() > 0) {
					sb.append(", ");
				}
				sb.append(String.format("%d -> %s", n.val,
						n.neighbors.stream().map(e -> e.val).collect(Collectors.toList())));
				n.neighbors.stream().forEach((e) -> {
					if (visited.contains(e) == false) {
						queue.add(e);
						visited.add(e);
					}
				});
			}

			return sb.toString();
		}
	}
}
