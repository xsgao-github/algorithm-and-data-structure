package ads.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0138CopyListWithRandomPointer {

	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}

		Node h1 = head;
		Node h2 = new Node(h1.val);

		// map of corresponding node in two lists
		Map<Node, Node> map = new HashMap<>();

		// copy
		Node n1 = h1;
		Node n2 = h2;
		map.put(n1, n2);
		while (n1.next != null) {
			n2.next = new Node(n1.next.val);
			n1 = n1.next;
			n2 = n2.next;
			map.put(n1, n2);
		}

		// set random pointer
		n1 = h1;
		n2 = h2;
		while (n1 != null) {
			if (n1.random != null) {
				n2.random = map.get(n1.random);
			}
			n1 = n1.next;
			n2 = n2.next;
		}

		return h2;
	}
}
