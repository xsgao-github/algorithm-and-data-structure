package ads.java.leetcode;

public class LongestCommonSubsequence_1143 {
	public int longestCommonSubsequence_recursive(String text1, String text2) {
		return longestCommonSubsequence(text1, text2, 0, 0);
	}

	public int longestCommonSubsequence(String text1, String text2, int i, int j) {
		// Boundary check
		if (i >= text1.length() || j >= text2.length()) {
			return 0;
		}

		if (text1.charAt(i) == text2.charAt(j)) {
			// match, go diagonally
			return 1 + longestCommonSubsequence(text1, text2, ++i, ++j);
		} else {
			// no match, to right or down
			return Math.max(longestCommonSubsequence(text1, text2, i + 1, j),
					longestCommonSubsequence(text1, text2, i, j + 1));
		}
	}

	public int longestCommonSubsequence_DP(String text1, String text2) {
		if (text1.length() == 0 || text2.length() == 0) {
			return 0;
		}

		char[] chars1 = text1.toCharArray();
		char[] chars2 = text2.toCharArray();

		int runningMax = 0;
		int l1 = chars1.length;
		int l2 = chars2.length;
		int[] nextRow = new int[l2 + 1]; // nums of next row
		int[] currRow = new int[l2 + 1]; // nums of current row
		int chr = 0; // char = text1.chartAt(i1 - 1)

		// fill out the bottom row
		chr = text1.charAt(l1 - 1);
		for (int i2 = l2 - 1; i2 >= 0; i2--) {
			if (chr == chars2[i2]) {
				// match, set to 1 - no next row and right cell value will be 0 or 1
				currRow[i2] = 1;
				runningMax = 1;
			} else {
				// bring the right cell value
				currRow[i2] = currRow[i2 + 1];
			}
		}

		// go up
		for (int i1 = l1 - 2; i1 >= 0; i1--) {
			nextRow = currRow;
			currRow = new int[l2 + 1];
			chr = chars1[i1];

			for (int i2 = l2 - 1; i2 >= 0; i2--) {
				if (chr == chars2[i2]) {
					// bring diagonal cell value + 1
					int max = nextRow[i2 + 1] + 1;
					if (max > runningMax) {
						runningMax = max;
					}
					currRow[i2] = max;
				} else {
					// look right or down
					currRow[i2] = Math.max(nextRow[i2], currRow[i2 + 1]);
				}
			}
		}

		return runningMax;
	}
}
