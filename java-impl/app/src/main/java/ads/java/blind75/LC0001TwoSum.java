package ads.java.blind75;

import java.util.HashMap;
import java.util.Map;

public class LC0001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer j = map.get(target - nums[i]);
            if (j != null && i != j) {
                return new int[] { i, j };
            }
        }
        return null;
    }
}
