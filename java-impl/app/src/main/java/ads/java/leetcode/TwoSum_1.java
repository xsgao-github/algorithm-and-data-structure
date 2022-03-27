package ads.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
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

    public static void main(String... args) {
        TwoSum_1 sum = new TwoSum_1();
        int[] ret = sum.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(String.format("%d, %d", ret[0], ret[1]));
        ret = sum.twoSum(new int[] { 3, 2, 4 }, 6);
        System.out.println(String.format("%d, %d", ret[0], ret[1]));
        ret = sum.twoSum(new int[] { 3, 3 }, 6);
        System.out.println(String.format("%d, %d", ret[0], ret[1]));
    }
}
