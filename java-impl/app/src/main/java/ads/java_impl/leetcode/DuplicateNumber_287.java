package ads.java_impl.leetcode;

public class DuplicateNumber_287 {
    public int findDuplicate(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i] < 0 ? -1 * nums[i] : nums[i];
            if (nums[a] < 0) {
                return a;
            } else {
                nums[a] *= -1;
            }
        }
        return 0;
    }
}
