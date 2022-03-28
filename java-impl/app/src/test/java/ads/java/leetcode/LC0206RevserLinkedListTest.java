package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.LC0206RevserLinkedList.ListNode;

class LC0206RevserLinkedListTest {

	@Test
	void testReverseList() {
		LC0206RevserLinkedList rll = new LC0206RevserLinkedList();
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		assertIterableEquals(Arrays.asList(new Integer[] { 5, 4, 3, 2, 1 }), rll.reverseList(head).toList());

		head = null;
		assertNull(rll.reverseList(head));
	}

}
