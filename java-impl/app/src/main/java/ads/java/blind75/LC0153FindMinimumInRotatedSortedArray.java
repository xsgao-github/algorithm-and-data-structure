package ads.java.blind75;

public class LC0153FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
    	if (nums.length == 1) {
    		// only one number
    		return nums[0];
    	}

    	if (nums[0] < nums[nums.length - 1]) {
    		// not rotated
    		return nums[0];
    	}

    	// [4,5,6,7,0,1,2,3]
    	int left = 1;
    	int right = nums.length - 1;
    	while (left < right) {
    		int mid = left + (right - left) / 2;
    		if (nums[mid] < nums[mid - 1]) {
    			return nums[mid];
    		} else if (nums[mid] > nums[right]) {
    			left = mid + 1;
    		} else {
    			right = mid - 1;
    		}
    	}
    	return nums[left];
    }
}
