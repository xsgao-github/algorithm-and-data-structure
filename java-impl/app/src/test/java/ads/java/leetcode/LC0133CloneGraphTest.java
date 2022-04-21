package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.LC0133CloneGraph.Node;

class LC0133CloneGraphTest {

	@Test
	void testCloneGraph() {
		LC0133CloneGraph graph = new LC0133CloneGraph();

		Node n = initGraph(
				new int[][] { new int[] { 2, 4 }, new int[] { 1, 3 }, new int[] { 2, 4 }, new int[] { 1, 3 } });
		Node n1 = graph.cloneGraph(n);
		assertEquals(n.printGraph(), n1.printGraph());

		n = null;
		n1 = graph.cloneGraph(n);
		assertNull(n1);

		n = initGraph(new int[][] { new int[] {} });
		n1 = graph.cloneGraph(n);
		assertEquals(n.printGraph(), n1.printGraph());
	}

	Node initGraph(int[][] adjList) {
		Node[] nodes = new Node[adjList.length];

		// init nodes
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new Node(i + 1);
		}

		// set up edges
		for (int i = 0; i < nodes.length; i++) {
			Node src = nodes[i];
			for (int j = 0; j < adjList[i].length; j++) {
				src.neighbors.add(nodes[adjList[i][j] - 1]);
			}
		}

		// return first node
		return nodes[0];
	}
}
