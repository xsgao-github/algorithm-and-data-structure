package ads.java.leetcode;

public class LC0371SumOfTwoIntegers {
	/**
	 * 5 - 0101 -4 - 1100
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int getSum(int a, int b) {
		int sum = 0;
		// significant 
		int s = 1;
		// value of a in current bit position
		int va = 0;
		// value of b in current bit position
		int vb = 0;
		// carry over
		int carry = 0;

		for (int i = 0; i < 32; i++) {
			// current position
			va = a & s;
			vb = b & s;
			if (va == 0) {
				if (vb == 0) {
					if (carry == 0) {
						// 0-0-0
						carry = 0;
					} else {
						// 0-0-1
						sum |= s;
						carry = 0;
					}
				} else {
					if (carry == 0) {
						// 0-1-0
						sum |= s;
						carry = 0;
					} else {
						// 0-1-1
						carry = s;
					}
				}
			} else {
				if (vb == 0) {
					if (carry == 0) {
						// 1-0-0
						sum |= s;
						carry = 0;
					} else {
						// 1-0-1
						carry = s;
					}
				} else {
					if (carry == 0) {
						// 1-1-0
						carry = s;
					} else {
						// 1-1-1
						sum |= s;
						carry = s;
					}
				}
			}
			// next position
			carry <<= 1;
			s <<= 1;
		}
		return sum;
	}
}
