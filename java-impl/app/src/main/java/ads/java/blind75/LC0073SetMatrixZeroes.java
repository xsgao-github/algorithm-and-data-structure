package ads.java.blind75;

import java.util.Arrays;

public class LC0073SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		// init row/column headers
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix[0].length];
		Arrays.fill(rows, 1);
		Arrays.fill(columns, 1);
		// detect 0
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				if (matrix[r][c] == 0) {
					rows[r] = 0;
					columns[c] = 0;
				}
			}
		}
		// set zeros
		for (int r = 0; r < matrix.length; r++) {
			if (rows[r] == 0) {
				for (int c = 0; c < matrix[0].length; c++) {
					matrix[r][c] = 0;
				}
			}
		}
		for (int c = 0; c < matrix[0].length; c++) {
			if (columns[c] == 0) {
				for (int r = 0; r < matrix.length; r++) {
					matrix[r][c] = 0;
				}
			}
		}
	}
}
