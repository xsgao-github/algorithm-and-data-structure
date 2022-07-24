package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class LC0286WallsAndGatesTest {

	@Test
	void testWallsAndGates() {
		LC0286WallsAndGates obj = new LC0286WallsAndGates();
		int[][] map = new int[][] { 
				new int[] { 0, 0, -1, 0, -1, -2 }, 
				new int[] { 0, 0, 0, -1, 0, 0 }, 
				new int[] { -1, 0, 0, 0, 0, 0 }, 
				new int[] { -2, 0, 0, 0, -1, 0 }
		};
		int[][] expect = new int[][] {
				new int[] { 5, 4, -1, 0, -1, -2 }, 
				new int[] { 4, 3, 4, -1, 2, 1 }, 
				new int[] { -1, 2, 3, 4, 3, 2 },
				new int[] { -2, 1, 2, 3, -1, 3 }
		};
		obj.wallsAndGates(map);
		for (int r = 0; r < map.length; r++) {
			assertArrayEquals(expect[r], map[r]);
		}
	}
}
