package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.RevserLinkedList_206.ListNode;

class RevserLinkedList_206Test {

	@Test
	void test() {
		RevserLinkedList_206 rll = new RevserLinkedList_206();
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		assertIterableEquals(Arrays.asList(new Integer[] { 5, 4, 3, 2, 1 }), rll.reverseList(head).toList());

		head = null;
		assertNull(rll.reverseList(head));
	}

}
