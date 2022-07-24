package ads.java.leetcode;

public class LC0287DuplicateNumber {
	public int findDuplicate(int[] nums) {
		int a = 0;
		int i = 0;
		for (i = 0; i < nums.length; i++) {
			a = nums[i] < 0 ? -1 * nums[i] : nums[i];
			if (nums[a] < 0) {
				// negative means someone else (duplicate) already flipped this element
				break;
			} else {
				// flip to negative sign to indicate this number is present
				nums[a] *= -1;
			}
		}
		// flip sign back
		for (int j = 0; j < i; j++) {
			nums[j] = -1 * nums[j];
		}
		return a;
	}
}
