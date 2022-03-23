package ads.java_impl.leetcode;

import java.util.Arrays;

public class SortColors_75 extends ACommand<Integer> {
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

    @Override
    public int[] arrayToArray(int[] input) {
        sortColors(input);
        return input;
    }

    public static void test(ICommand<Integer> command, int[] input, int[] expect) {
        int[] output = command.arrayToArray(input);
        if (Arrays.equals(output, expect)) {
            System.out.println("pass");
        } else {
            System.err.println(String.format("error, incorrect output: %s, expect: %s", Arrays.toString(output),
                    Arrays.toString(expect)));
        }
    }

    public static void main(String... args) {
        SortColors_75 sc = new SortColors_75();
        test(sc, new int[] { 2, 0, 2, 1, 1, 0 }, new int[] { 0, 0, 1, 1, 2, 2 });
        test(sc, new int[] { 2, 0, 1 }, new int[] { 0, 1, 2 });
    }
}
