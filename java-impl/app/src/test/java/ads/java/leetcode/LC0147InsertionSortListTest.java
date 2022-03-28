package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.LC0147InsertionSortList.ListNode;

class LC0147InsertionSortListTest {

	@Test
	void test() {
		LC0147InsertionSortList obj = new LC0147InsertionSortList();

		ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
		assertIterableEquals(Arrays.asList(new Integer[] { 1, 2, 3, 4 }), obj.insertionSortList(head).toList());

		head = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
		assertIterableEquals(Arrays.asList(new Integer[] { -1, 0, 3, 4, 5 }), obj.insertionSortList(head).toList());

		head = new ListNode(1);
		assertIterableEquals(Arrays.asList(new Integer[] { 1 }), obj.insertionSortList(head).toList());

		head = null;
		assertNull(obj.insertionSortList(head));
	}

}
