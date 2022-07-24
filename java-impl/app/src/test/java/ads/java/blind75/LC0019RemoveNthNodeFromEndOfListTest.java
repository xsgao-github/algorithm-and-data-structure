package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ads.java.leetcode.ListNode;

class LC0019RemoveNthNodeFromEndOfListTest {

	@Test
	void testRemoveNthFromEnd() {
		LC0019RemoveNthNodeFromEndOfList obj = new LC0019RemoveNthNodeFromEndOfList();
		ListNode head = ListNode.createList(new int[] { 1, 2, 3, 4, 5 });
		assertArrayEquals(new int[] { 1, 2, 3, 5 }, obj.removeNthFromEnd(head, 2).toArray());
	}

}
