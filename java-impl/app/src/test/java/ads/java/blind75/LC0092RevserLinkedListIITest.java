package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.ListNode;

class LC0092RevserLinkedListIITest {

	@Test
	void testReverseList() {
		LC0092RevserLinkedListII rll = new LC0092RevserLinkedListII();
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		assertIterableEquals(Arrays.asList(new Integer[] { 1, 4, 3, 2, 5 }), rll.reverseList(head, 2, 4).toList());

		head = new ListNode(3, new ListNode(5));
		assertIterableEquals(Arrays.asList(new Integer[] { 5, 3 }), rll.reverseList(head, 1, 2).toList());

		head = new ListNode(1);
		assertIterableEquals(Arrays.asList(new Integer[] { 1 }), rll.reverseList(head, 1, 1).toList());

		head = null;
		assertNull(rll.reverseList(head, 1, 1));
	}

}
