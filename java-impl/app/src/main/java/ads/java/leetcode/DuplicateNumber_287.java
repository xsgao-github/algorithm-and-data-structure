package ads.java.leetcode;

public class DuplicateNumber_287 {
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

	public int findDuplicateGauss(int[] nums) {
		if (nums.length < 256 * 128) {
			int s = 0;
			for (int i : nums) {
				s += i;
			}
			// if there is no duplicate
			int g = 0;
			if (nums.length % 2 == 0) {
				g = ((nums.length / 2) * (nums.length - 1));
			} else {
				g = (((nums.length - 1) / 2) * nums.length);
			}
			return s - g;
		} else {
			long s = 0;
			for (int i : nums) {
				s += i;
			}
			// if there is no duplicate
			long g = 0;
			if (nums.length % 2 == 0) {
				g = (((long) nums.length) / 2) * (((long) nums.length) - 1);
			} else {
				g = ((((long) nums.length) - 1) / 2) * ((long) nums.length);
			}
			// TODO if s overflow but g not
			return (int) (s - g);
		}
	}
}
