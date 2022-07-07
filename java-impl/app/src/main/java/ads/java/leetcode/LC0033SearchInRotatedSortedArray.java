package ads.java.leetcode;

public class LC0033SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int l = 0, r = nums.length - 1, m;
		while (l <= r) {
			m = l + (r - l) / 2;

			// found
			if (target == nums[m])
				return m;

			if (nums[l] <= nums[m]) {
				// search 4 in [3, 4, 5, 6, 0, 1, 2]
				// target between left and middle
				if (nums[l] <= target && target <= nums[m]) {
					r = m - 1;
				} else {
					l = m + 1;
				}
			} else {
				// search 4 in [5, 6, 0, 1, 2, 3, 4]
				// target between middle and right
				if (nums[m] < target && target <= nums[r]) {
					l = m + 1;
				} else {
					r = m - 1;
				}
			}
		}
		return -1;
	}
}
