package ads.java.leetcode;

public class LC0021MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    	if (list1 == null && list2 == null) {
    		return null;
    	} else if (list1 == null) {
    		return list2;
    	} else if (list2 == null) {
    		return list1;
    	}

    	// get head
    	ListNode head, n, n1 = list1, n2 = list2;
    	if (n1.val <= n2.val) {
    		head = n1;
    		n1 = n1.next;
    	} else {
    		head = n2;
    		n2 = n2.next;
    	}
    	n = head;

    	// merge until one list is fully merged
    	while (n1 != null && n2 != null) {
        	if (n1.val <= n2.val) {
        		n.next = n1;
        		n1 = n1.next;
        	} else {
        		n.next = n2;
        		n2 = n2.next;
        	}
        	n = n.next;
    	}

    	// append the rest of the other list
    	if (n1 != null) {
    		n.next = n1;
    	} else {
    		n.next = n2;
    	}
    	
    	return head;
    }
}
