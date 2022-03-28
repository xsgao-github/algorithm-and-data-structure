package ads.java.leetcode;

public class LC1143LongestCommonSubsequence {
	public int longestCommonSubsequence_recursive(String text1, String text2) {
		return longestCommonSubsequence_recursive(text1, text2, 0, 0);
	}

	private int longestCommonSubsequence_recursive(String text1, String text2, int i, int j) {
		// Boundary check
		if (i >= text1.length() || j >= text2.length()) {
			return 0;
		}

		if (text1.charAt(i) == text2.charAt(j)) {
			// match, go diagonally
			return 1 + longestCommonSubsequence_recursive(text1, text2, ++i, ++j);
		} else {
			// no match, to right or down
			return Math.max(longestCommonSubsequence_recursive(text1, text2, i + 1, j),
					longestCommonSubsequence_recursive(text1, text2, i, j + 1));
		}
	}

	/**
	 * Right to left.
	 * 
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence_R2L(String text1, String text2) {
		if (text1.length() == 0 || text2.length() == 0) {
			return 0;
		}

		char[] rowChrs = text1.toCharArray();
		char[] colChrs = text2.toCharArray();

		int rowSize = rowChrs.length;
		int colSize = colChrs.length;
		int[] nextRow = new int[colSize + 1]; // nums of next row
		int[] currRow = new int[colSize + 1]; // nums of current row
		int chr = 0; // char = text1.chartAt(i1 - 1)

		// fill out the bottom row
		chr = rowChrs[rowSize - 1];
		for (int c = colSize - 1; c >= 0; c--) {
			if (chr == colChrs[c]) {
				// match, set to 1 - no next row and right cell value will be 0 or 1
				currRow[c] = 1;
			} else {
				// bring the right cell value
				currRow[c] = currRow[c + 1];
			}
		}

		// go up
		for (int r = rowSize - 2; r >= 0; r--) {
			nextRow = currRow;
			currRow = new int[colSize + 1];
			chr = rowChrs[r];

			for (int c = colSize - 1; c >= 0; c--) {
				if (chr == colChrs[c]) {
					// bring diagonal cell value + 1
					currRow[c] = nextRow[c + 1] + 1;
				} else {
					// look right and down
					currRow[c] = Math.max(nextRow[c], currRow[c + 1]);
				}
			}
		}

		return currRow[0];
	}

	/**
	 * Left to right.
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence_L2R(String text1, String text2) {
		if (text1.length() == 0 || text2.length() == 0) {
			return 0;
		}

		char[] rowChrs = text1.toCharArray();
		char[] colChrs = text2.toCharArray();

		int rowSize = rowChrs.length;
		int colSize = colChrs.length;
		int[] prevRow = new int[colSize]; // nums of previous row
		int[] currRow = new int[colSize]; // nums of current row
		int chr = 0; // char = text1.chartAt(i1 - 1)

		// fill out the top row
		chr = rowChrs[0];
		// first column
		if (chr == colChrs[0]) {
			currRow[0] = 1;
		}
		// other columns
		for (int c = 1; c < colSize; c++) {
			if (chr == colChrs[c]) {
				// match, set to 1 - no next row and right cell value will be 0 or 1
				currRow[c] = 1;
			} else {
				// bring the left cell value
				currRow[c] = currRow[c - 1];
			}
		}

		// go down
		for (int r = 1; r < rowSize; r++) {
			// reset prevRow and currRow
			prevRow = currRow;
			currRow = new int[colSize];

			chr = rowChrs[r];
			// first column
			if (chr == rowChrs[0]) {
				currRow[0] = 1;
			} else {
				currRow[0] = prevRow[0];
			}
			// other columns
			for (int c = 1; c < colSize; c++) {
				if (chr == colChrs[c]) {
					// bring diagonal cell value + 1
					currRow[c] = prevRow[c - 1] + 1;
				} else {
					// look up and left
					currRow[c] = Math.max(prevRow[c], currRow[c - 1]);
				}
			}
		}

		return currRow[colSize - 1];
	}
}
