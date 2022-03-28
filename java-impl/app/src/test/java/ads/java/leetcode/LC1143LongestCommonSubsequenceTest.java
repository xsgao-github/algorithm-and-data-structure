package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LC1143LongestCommonSubsequenceTest {

	@Test
	void testLongestCommonSubsequence_recursive() {
		LC1143LongestCommonSubsequence lcs = new LC1143LongestCommonSubsequence();
		assertEquals(3, lcs.longestCommonSubsequence_recursive("abc", "bcxabc"));
		assertEquals(3, lcs.longestCommonSubsequence_recursive("abcde", "ace"));
		assertEquals(3, lcs.longestCommonSubsequence_recursive("ace", "abcde"));
		assertEquals(3, lcs.longestCommonSubsequence_recursive("abc", "abc"));
		assertEquals(0, lcs.longestCommonSubsequence_recursive("abc", "def"));
		assertEquals(0, lcs.longestCommonSubsequence_recursive("abc", ""));
	}

	@Test
	void testLongestCommonSubsequence_R2L() {
		LC1143LongestCommonSubsequence lcs = new LC1143LongestCommonSubsequence();
		assertEquals(2, lcs.longestCommonSubsequence_R2L("oxcpqrsvwf", "shmtulqrypy"));
		assertEquals(5, lcs.longestCommonSubsequence_R2L("abcba", "abcbcba"));
		assertEquals(1, lcs.longestCommonSubsequence_R2L("bc", "ac"));
		assertEquals(3, lcs.longestCommonSubsequence_R2L("abc", "bcxabc"));
		assertEquals(3, lcs.longestCommonSubsequence_R2L("abcde", "ace"));
		assertEquals(3, lcs.longestCommonSubsequence_R2L("ace", "abcde"));
		assertEquals(3, lcs.longestCommonSubsequence_R2L("abc", "abc"));
		assertEquals(0, lcs.longestCommonSubsequence_R2L("abc", "def"));
		assertEquals(0, lcs.longestCommonSubsequence_R2L("abc", ""));
	}


	@Test
	void testLongestCommonSubsequence_L2R() {
		LC1143LongestCommonSubsequence lcs = new LC1143LongestCommonSubsequence();
		assertEquals(2, lcs.longestCommonSubsequence_L2R("oxcpqrsvwf", "shmtulqrypy"));
		assertEquals(5, lcs.longestCommonSubsequence_L2R("abcba", "abcbcba"));
		assertEquals(1, lcs.longestCommonSubsequence_L2R("bc", "ac"));
		assertEquals(3, lcs.longestCommonSubsequence_L2R("abc", "bcxabc"));
		assertEquals(3, lcs.longestCommonSubsequence_L2R("abcde", "ace"));
		assertEquals(3, lcs.longestCommonSubsequence_L2R("ace", "abcde"));
		assertEquals(3, lcs.longestCommonSubsequence_L2R("abc", "abc"));
		assertEquals(0, lcs.longestCommonSubsequence_L2R("abc", "def"));
		assertEquals(0, lcs.longestCommonSubsequence_L2R("abc", ""));
	}
}
