package ads.java.leetcode;

public class LC0206RevserLinkedList {
	/**
	 * <pre>
	 *  
	 *   > 1 > 2 > 3 
	 * p   c   n
	 * </pre>
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
