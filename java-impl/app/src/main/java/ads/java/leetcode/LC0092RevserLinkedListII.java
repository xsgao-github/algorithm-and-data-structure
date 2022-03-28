package ads.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0092RevserLinkedListII {
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

	/**
	 * <pre>
	 *  
	 *   > 1 > 2 > 3 
	 * p   c   n
	 * </pre>
	 */
	public ListNode reverseList(ListNode head, int left, int right) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		if (left == right) {
			return head;
		}
		
		// add dummy head
		ListNode dummy = new ListNode(0, head);

		// find break point
		ListNode breakPoint = dummy;
		int i = 0;
		while (i < left - 1) {
			breakPoint = breakPoint.next;
			i++;
		}

		// reverse middle, except the last one
		ListNode p = breakPoint;
		ListNode c = breakPoint.next;
		ListNode n = c.next;
		c.next = p;
		i = left;
		while (n != null && i < right) {
			p = c;
			c = n;
			n = n.next;
			c.next = p;
			i++;
		}

		// connect 3 parts
		breakPoint.next.next = n;
		breakPoint.next = c;

		return dummy.next;
	}
}
