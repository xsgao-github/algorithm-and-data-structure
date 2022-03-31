package ads.java.leetcode;

public final class LC0198HouseRobber {
    public int rob(int[] nums) {
    	if (nums.length == 1) {
    		return nums[0];
    	}
    	if (nums.length == 2) {
    		return Math.max(nums[0], nums[1]);
    	}

    	int r2 = 0, r1 = 0, r0 = 0;
    	r2 = nums[0];
    	r1 = Math.max(nums[0], nums[1]);
    	for (int i = 2; i < nums.length; i++) {
    		r0 = Math.max(r2 + nums[i], r1);
    		r2 = r1;
    		r1 = r0;
    	}
    	
    	return r0;
    }

	private int recursive(int[] nums, int r) {
		if (r == 0) {
			return nums[0];
		} if (r == 1) {
			return Math.max(nums[0], nums[1]);
		} else {
	        return Math.max(recursive(nums, r - 2) + nums[r], recursive(nums, r - 1)); 
		}
	}
}
