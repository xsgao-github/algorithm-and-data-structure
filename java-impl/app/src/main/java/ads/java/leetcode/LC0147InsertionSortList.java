package ads.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0147InsertionSortList {
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
