package ads.java.leetcode;

public class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("[%d, %s] > ", val, random == null ? "" : random.val + ""));
		sb.append(next == null ? "null" : next.toString());
		return sb.toString();
	}
}
