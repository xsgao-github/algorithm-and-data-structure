package ads.java.leetcode;

public class LC0147InsertionSortList {

	/**
	 * <pre>
	 * </pre>
	 */
    public ListNode insertionSortList(ListNode head) {
    	if (head == null) {
    		return null;
    	}
    	if (head.next == null) {
    		return head;
    	}
    	ListNode dummy = new ListNode(Integer.MIN_VALUE, head);

    	ListNode p = dummy;
    	ListNode c = head;
    	ListNode n = head.next;
    	ListNode tmp = null;
    	while (c != null) {
    		if (p.val > c.val) {
    			// move
    			tmp = dummy;
    			while (tmp.next.val < c.val) {
    				tmp = tmp.next;
    			}
    			c.next = tmp.next;
    			tmp.next = c;
    			
    			// fill the gap left by c
    			p.next = n;
    			c = n;
    			n = n == null ? null : n.next;
    		} else {
    			// no move
	    		p = c;
	    		c = n;
	    		n = n == null ? null : n.next;
    		}
    	}
        return dummy.next;
    }
}
