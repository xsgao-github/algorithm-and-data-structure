package ads.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RevserLinkedList_206 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
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

		@Override
		public String toString() {
			return String.valueOf(this.val);
		}
	}

	
	/*
	 *     1 > 2 > 3
	 * p   c   n
	 */
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}

		ListNode p = null;
		ListNode c = head;
		ListNode n = c.next;
		c.next = p;
		while (n != null) {
			p = c;
			c = n;
			n = n.next;
			c.next = p;
		}
		return c;
	}
}
