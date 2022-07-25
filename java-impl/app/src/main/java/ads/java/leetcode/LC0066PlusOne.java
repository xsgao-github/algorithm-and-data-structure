package ads.java.leetcode;

public class LC0066PlusOne {
	public int[] plusOne(int[] digits) {
		int carryover = 0;
		// plus one
		int idx = digits.length - 1;
		if (digits[idx] + 1 == 10) {
			digits[idx] = 0;
			carryover = 1;
		} else {
			digits[idx] = digits[idx] + 1 + carryover;
			carryover = 0;
		}

		// carryover
		for (idx--; idx >= 0; idx--) {
			if (digits[idx] + carryover == 10) {
				digits[idx] = 0;
				carryover = 1;
			} else {
				digits[idx] = digits[idx] + carryover;
				carryover = 0;
				break;
			}
		}

		if (carryover == 0) {
			return digits;
		} else {
			int[] ret = new int[digits.length + 1];
			System.arraycopy(digits, 0, ret, 1, digits.length);
			ret[0] = 1;
			return ret;
		}
	}
}
