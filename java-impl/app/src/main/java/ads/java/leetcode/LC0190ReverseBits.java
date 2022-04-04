package ads.java.leetcode;

public class LC0190ReverseBits {
	private static int[] lookup = initReverseBits();
	
	private static int[] initReverseBits() {
		int[] m = new int[1 << 8];
		for (int i = 0; i < 256; i++) {
			for (int j = 0; j < 8; j++) {
				m[i] |= ((i >> j) & 1) << (7 - j);
			}
		}
		return m;
	}

	public int reverseBits(int n) {
		int m = 0;
		m |= (lookup[n & 255]) << 24;
		m |= (lookup[(n >> 8) & 255]) << 16;
		m |= (lookup[(n >> 16) & 255]) << 8;
		m |= lookup[(n >> 24) & 255];
		return m;
	}
}
