package ads.java.leetcode;

public class LC0141LInkedListCycle {

	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

		@Override
		public String toString() {
			return String.valueOf(val);
		}
	}

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}

		return false;
	}
}
