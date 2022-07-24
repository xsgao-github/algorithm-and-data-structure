package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC0021MergeTwoSortedListsTest {

	@Test
	void test() {
		LC0021MergeTwoSortedLists obj = new LC0021MergeTwoSortedLists();

		ListNode list1 = ListNode.createList(new int[] { 1, 2, 4 });
		ListNode list2 = ListNode.createList(new int[] { 1, 3, 4 });
		assertEquals(Arrays.asList(new Integer[] { 1, 1, 2, 3, 4, 4 }), obj.mergeTwoLists(list1, list2).toList());

		list1 = ListNode.createList(new int[] {});
		list2 = ListNode.createList(new int[] {});
		assertNull(obj.mergeTwoLists(list1, list2));

		list1 = ListNode.createList(new int[] {});
		list2 = ListNode.createList(new int[] { 0 });
		assertEquals(Arrays.asList(new Integer[] { 0 }), obj.mergeTwoLists(list1, list2).toList());
	}

}
