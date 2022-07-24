package ads.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public List<Integer> toList() {
		List<Integer> l = new ArrayList<>();
		l.add(val);
		ListNode n = this;
		while ((n = n.next) != null) {
			l.add(n.val);
		}
		return l;
	}

	public int[] toArray() {
		List<Integer> l = toList();
		int[] a = new int[l.size()];
		for (int i = 0; i < a.length; i++) {
			a[i] = l.get(i);
		}
		return a;
	}

	@Override
	public String toString() {
		return String.valueOf(this.val);
	}

	public static ListNode createList(int[] vals) {
		if (vals.length == 0) {
			return null;
		}

		ListNode head = new ListNode(vals[0]);
		if (vals.length > 1) {
			int[] sub = new int[vals.length - 1];
			System.arraycopy(vals, 1, sub, 0, sub.length);
			addNodes(head, sub);
		}
		return head;
	}

	private static ListNode addNodes(ListNode head, int[] vals) {
		ListNode n = head;
		for (int val : vals) {
			n = addNode(n, val);
		}
		return n;
	}

	private static ListNode addNode(ListNode p, int val) {
		ListNode n = new ListNode(val);
		p.next = n;
		return n;
	}
}
