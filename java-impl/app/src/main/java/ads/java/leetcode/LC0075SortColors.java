package ads.java.leetcode;

import java.util.Arrays;

public class LC0075SortColors {
    public void sortColors(int[] nums) {
        // left/right bounds of value 1
        int l = 0, r = nums.length - 1;
        int i = 0;
        // prescan
        for (i = 0; i < nums.length && nums[i] == 0; i++) {
            l++;
        }
        for (i = nums.length - 1; i >= 0 && nums[i] == 2; i--) {
            r--;
        }

        for (i = l; i <= r;) {
            if (nums[i] == 0) {
                if (i > l) {
                    swap(nums, i, l);
                }
                l++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, r);
                r--;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String... args) {
        LC0075SortColors sc = new LC0075SortColors();
        int[] output = null;

        int[] input = new int[] { 2, 0, 2, 1, 1, 0 };
        int[] expect = new int[] { 0, 0, 1, 1, 2, 2 };
        sc.sortColors(input);
        output = input;
        System.out.println(Arrays.equals(output, expect));

        input = new int[] { 2, 0, 1 };
        expect = new int[] { 0, 1, 2 };
        sc.sortColors(input);
        output = input;
        System.out.println(Arrays.equals(output, expect));
    }
}
