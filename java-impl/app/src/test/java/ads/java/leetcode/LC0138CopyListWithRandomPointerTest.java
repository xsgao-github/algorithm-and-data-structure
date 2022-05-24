package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class LC0138CopyListWithRandomPointerTest {

	@Test
	void testCopyRandomList() {
		LC0138CopyListWithRandomPointer obj = new LC0138CopyListWithRandomPointer();

		//[[7,null],[13,0],[11,4],[10,2],[1,0]]
		Node n7 = new Node(7);
		Node n13 = new Node(13);
		Node n11 = new Node(11);
		Node n10 = new Node(10);
		Node n1 = new Node(1);

		n7.next = n13;
		n13.next = n11;
		n11.next = n10;
		n10.next = n1;
		n1.next = null;

		n7.random = null;
		n13.random = n7;
		n11.random = n1;
		n10.random = n11;
		n1.random = n7;
		
		assertEquals(n7.toString(), obj.copyRandomList(n7).toString());
		
		assertNull(obj.copyRandomList(null));
	}

}
