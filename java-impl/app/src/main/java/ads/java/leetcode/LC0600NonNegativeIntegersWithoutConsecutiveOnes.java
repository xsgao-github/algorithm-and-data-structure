package ads.java.leetcode;

public class LC0600NonNegativeIntegersWithoutConsecutiveOnes {
	/**
	 * <p>
	 * How many integers without consecutive ones.
	 * </p>
	 * <p>
	 * First of all, we need to exclude <tt>0</tt>. Taking number <tt>5 =
	 * 0b101<tt> for example. We take <tt>4 = 0b100</tt> first, and count the number
	 * of valid integers between 0 and 4 is 4. Then we take <tt>1 = 0b1</tt>, and
	 * count the number of valid integers between 0 and 1 is 2. So the total would
	 * be 4 + 2 = 5. We do this because we treat these numbers in second round are
	 * prefixed with 0b100. But one case in the first round, 4 = 0b100, is duplicate
	 * as the case, 4 + 0 = 4 in the second round.
	 * </p>
	 * <p>
	 * By removing 0 we can avoid double counting, but need to remember add 1 in the
	 * final return;
	 * </p>
	 * <p>
	 * In range [1], you have 1 combination. In range [1, 0b10], you have 2
	 * combinations. In range [1, 0b100], you can put 0 in b2 and use b1 & b0. Or
	 * you can put 1 in b2, then have to put 0 in b1 and only b0 is available. So
	 * f(3) = f(2) + f(1).
	 * </p>
	 */
	static int[] VIN = initValidIntegerNumbers();

	private static int[] initValidIntegerNumbers() {
		int f[] = new int[32];
		f[0] = 1;
		f[1] = 2;
		for (int i = 2; i < 32; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f;
	}

	public int findIntegers(int n) {
		int ret = 0;
		boolean hasLeadOne = false;

		for (int k = 31; k >= 0; k--) {
			if ((n & (1 << k)) != 0) {
				// if this bit is on
				ret += VIN[k];
				if (hasLeadOne) {
					// two consecutive ones, less significant bit won't be counted
					return ret;
				} else {
					hasLeadOne = true;
				}
			} else {
				hasLeadOne = false;
			}
		}

		return ret + 1;
	}
}
