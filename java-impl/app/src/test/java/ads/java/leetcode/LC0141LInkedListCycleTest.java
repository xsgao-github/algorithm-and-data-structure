package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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

		ListNode head = ListNode.createList(vals);
		ListNode tail = head;
		while (tail.next != null) {
			tail = tail.next;
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
}
