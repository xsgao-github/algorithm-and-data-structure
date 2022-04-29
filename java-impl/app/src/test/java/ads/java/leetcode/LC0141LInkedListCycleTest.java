package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.LC0141LInkedListCycle.ListNode;

class LC0141LInkedListCycleTest {

	@Test
	void test() {
		LC0141LInkedListCycle obj = new LC0141LInkedListCycle();

		ListNode head = createTestCase(new int[] { 3, 2, 0, -4 }, 1);
		assertTrue(obj.hasCycle(head));

		head = createTestCase(new int[] {}, -1);
		assertFalse(obj.hasCycle(head));

		head = createTestCase(new int[] { 1 }, 0);
		assertTrue(obj.hasCycle(head));

		head = createTestCase(new int[] { 1 }, -1);
		assertFalse(obj.hasCycle(head));
	}

	private ListNode createTestCase(int[] vals, int pos) {
		if (vals.length == 0) {
			return null;
		}

		ListNode head = new ListNode(vals[0]);
		ListNode tail = head;
		if (vals.length > 1) {
			int[] sub = new int[vals.length - 1];
			System.arraycopy(vals, 1, sub, 0, sub.length);
			tail = addNodes(head, sub);
		}
		if (pos >= 0) {
			ListNode n = head;
			for (int i = 0; i < pos; i++) {
				n = n.next;
			}
			tail.next = n;
		}
		return head;
	}

	private ListNode addNodes(ListNode head, int[] vals) {
		ListNode n = head;
		for (int val : vals) {
			n = addNode(n, val);
		}
		return n;
	}

	private ListNode addNode(ListNode p, int val) {
		ListNode n = new ListNode(val);
		p.next = n;
		return n;
	}

}
