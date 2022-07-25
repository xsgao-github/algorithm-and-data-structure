package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class LC0073SetMatrixZeroesTest {

	@Test
	void test() {
		LC0073SetMatrixZeroes obj = new LC0073SetMatrixZeroes();
		int[][] actual = new int[][] { new int[] { 1, 1, 1 }, new int[] { 1, 0, 1 }, new int[] { 1, 1, 1 } };
		obj.setZeroes(actual);
		int[][] expect = new int[][] { new int[] { 1, 0, 1 }, new int[] { 0, 0, 0 }, new int[] { 1, 0, 1 } };
		assertArrayEquals(expect, actual);
	}

}
