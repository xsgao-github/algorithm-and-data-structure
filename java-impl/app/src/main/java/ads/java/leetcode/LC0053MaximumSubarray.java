package ads.java.leetcode;

public class LC0053MaximumSubarray {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		
		int max = nums[0];
		int sum = 0;
		for (int n : nums) {
			// max
			sum += n;
			max = Math.max(max, sum);
			
			// discard sum if it makes negative contribution
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}
