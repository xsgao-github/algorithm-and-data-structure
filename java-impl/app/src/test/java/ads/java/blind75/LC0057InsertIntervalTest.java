package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0057InsertIntervalTest {

	@Test
	void testInsert() {
		LC0057InsertInterval obj = new LC0057InsertInterval();
		assertArrayEquals(new int[][] { new int[] { 1, 5 }, new int[] { 6, 9 } },
				obj.insert(new int[][] { new int[] { 1, 3 }, new int[] { 6, 9 } }, new int[] { 2, 5 }));
		assertArrayEquals(new int[][] { new int[] { 1, 2 }, new int[] { 3, 10 }, new int[] { 12, 16 } },
				obj.insert(new int[][] { new int[] { 1, 2 }, new int[] { 3, 5 }, new int[] { 6, 7 },
						new int[] { 8, 10 }, new int[] { 12, 16 } }, new int[] { 4, 8 }));
		assertArrayEquals(new int[][] { new int[] { 5, 7 } }, obj.insert(new int[][] {}, new int[] { 5, 7 }));
		assertArrayEquals(new int[][] { new int[] { 1, 7 } },
				obj.insert(new int[][] { new int[] { 1, 5 } }, new int[] { 1, 7 }));
	}

}
