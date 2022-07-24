package ads.java.blind75;

public class LC0152MaximumProductSubarray {
	public int maxProduct(int[] nums, String alg) {
		int max = Integer.MIN_VALUE;

		int l = -1, r = -1;
		while (l < nums.length) {
			// find left/right boundary of sub array divided by 0
			while (++l < nums.length && nums[l] == 0) {
			}
			r = l;
			while (++r < nums.length && nums[r] != 0) {
			}

			if (l != 0 || r != nums.length) {
				// found at least one 0
				max = Math.max(max, 0);
			}

			// find max product of sub array
			if (l < nums.length) {
				if (alg.equals("S")) {
					max = Math.max(max, maxProductSegment(nums, l, r));
				} else {
					max = Math.max(max, maxProductTwoWay(nums, l, r));
				}
			}
			l = r;
		}
		return max;
	}

	/**
	 * Let <tt>i, j, k, l</tt> be the products of sub arrays with only positive
	 * number.
	 * <ol>
	 * <li>When <tt>product(nums)</tt> is positive, the max is:
	 * <tt>product(nums)</tt> itself.</li>
	 * <li>When <tt>product(nums)</tt> is negative, that means there is at least one
	 * negative value, e.g. [i, -2, j, -1, k, -3, l], the max is: <tt>
	 *     max(product(sums) / (i * (-2)), product(sums) / (l * (-3))); 
	 * </tt></li>
	 * </ol>
	 * <p/>
	 * 
	 * @param nums
	 * @param l
	 * @param r
	 * @return
	 */
	private int maxProductSegment(int[] nums, int l, int r) {
		if (l == r - 1) {
			return nums[l];
		}

		int p = 1, pl = 1, pr = 1;

		for (int i = l; i < r; i++) {
			p *= nums[i];
		}

		if (p > 0) {
			return p;
		}

		for (int i = l; i < r && pl > 0; i++) {
			pl *= nums[i];
		}

		for (int i = r - 1; i >= l && pr > 0; i--) {
			pr *= nums[i];
		}

		return Math.max(p / pl, p / pr);
	}

	/**
	 * Find max product of sub arrays within <tt>sums</tt> between <tt>l</tt>
	 * (inclusive) and <tt>r</tt> (exclusive) by calculating from both directions.
	 * 
	 * @param nums
	 * @param l
	 * @param r
	 * @return
	 */
	private int maxProductTwoWay(int[] nums, int l, int r) {
		int max = Integer.MIN_VALUE;

		// left to right
		int p = 1;
		for (int i = l; i < r; i++) {
			p *= nums[i];
			max = Math.max(max, p);
		}

		// right to left
		p = 1;
		for (int i = r - 1; i >= l; i--) {
			p *= nums[i];
			max = Math.max(max, p);
		}

		return max;
	}
}
