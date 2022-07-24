package ads.java.blind75;

public class LC0213HouseRobberII {
    public int rob(int[] nums) {
    	if (nums.length == 1) {
    		return nums[0];
    	} else if (nums.length == 2) {
    		return Math.max(nums[0], nums[1]);
    	}
    	
    	return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

	private int rob(int[] nums, int start, int end) {
		if (end - start == 0) {
			return 0;
		} else if (end - start == 1) {
			return nums[start];
		} else if (end - start == 2) {
			return Math.max(nums[start], nums[start + 1]);
		}

		int max2, max1, max = 0;
		max2 = nums[start];
		max1 = Math.max(nums[start], nums[start + 1]);
		for (int i = start + 2; i < end; i++) {
			max = Math.max(max2 + nums[i], max1);
			max2 = max1;
			max1 = max;
		}
		return max;
	}
}
