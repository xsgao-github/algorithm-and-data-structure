package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequence_1143Test {

//	@Test
//	void testLongestCommonSubsequence_recursive() {
//		LongestCommonSubsequence_1143 lcs = new LongestCommonSubsequence_1143();
//		assertEquals(3, lcs.longestCommonSubsequence_recursive("abc", "bcxabc"));
//		assertEquals(3, lcs.longestCommonSubsequence_recursive("abcde", "ace"));
//		assertEquals(3, lcs.longestCommonSubsequence_recursive("ace", "abcde"));
//		assertEquals(3, lcs.longestCommonSubsequence_recursive("abc", "abc"));
//		assertEquals(0, lcs.longestCommonSubsequence_recursive("abc", "def"));
//		assertEquals(0, lcs.longestCommonSubsequence_recursive("abc", ""));
//	}

	@Test
	void testLongestCommonSubsequence_DP() {
		LongestCommonSubsequence_1143 lcs = new LongestCommonSubsequence_1143();
		assertEquals(2, lcs.longestCommonSubsequence_DP("oxcpqrsvwf", "shmtulqrypy"));
		assertEquals(5, lcs.longestCommonSubsequence_DP("abcba", "abcbcba"));
		assertEquals(1, lcs.longestCommonSubsequence_DP("bc", "ac"));
		assertEquals(3, lcs.longestCommonSubsequence_DP("abc", "bcxabc"));
		assertEquals(3, lcs.longestCommonSubsequence_DP("abcde", "ace"));
		assertEquals(3, lcs.longestCommonSubsequence_DP("ace", "abcde"));
		assertEquals(3, lcs.longestCommonSubsequence_DP("abc", "abc"));
		assertEquals(0, lcs.longestCommonSubsequence_DP("abc", "def"));
		assertEquals(0, lcs.longestCommonSubsequence_DP("abc", ""));
	}

}
