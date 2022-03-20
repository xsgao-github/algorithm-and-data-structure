package ads.java_impl.leetcode;

public class FirstMissingPositive_41 {
    /**
     * 
     * @param nums
     * @return
     */
    public int firstMissingPositive(int[] nums) {
        // place number in the possition it should be in a X axis,
        // e.g. [4, 2, 4, 1] should be placed at [1, 2, 0, 4, 5], where 0 represents
        // missing number
        int i = 0;
        int len = nums.length;
        int tmp = 0;
        while (i < len) {
            if (nums[i] <= 0 || nums[i] > len) {
                // exclude number out of range
                nums[i++] = 0;
            } else if (nums[i] == i + 1) {
                // in the right position
                i++;
            } else if (nums[i] == nums[nums[i] - 1]) {
                // same, set current to 0
                nums[i++] = 0;
            } else {
                // put nums[i]rent value to the possition it should be
                // e.g. 4 should be at nums[4-1]
                tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                // don't increase i, deal with the newly swapped number
                nums[i] = tmp;
            }
        }

        // find fist missing possitive
        for (i = 0; i < len; i++) {
            if (nums[i] == 0) {
                return i + 1;
            }
        }
        return len + 1;
    }

    public static void main(String... args) {
        FirstMissingPositive_41 fmp = new FirstMissingPositive_41();
        System.out.println(2 == fmp.firstMissingPositive(new int[] { 1 }));
        System.out.println(2 == fmp.firstMissingPositive(new int[] { 1, 1 }));
        System.out.println(3 == fmp.firstMissingPositive(new int[] { 1, 2, 0 }));
        System.out.println(3 == fmp.firstMissingPositive(new int[] { 0, 1, 2 }));
        System.out.println(2 == fmp.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
        System.out.println(1 == fmp.firstMissingPositive(new int[] { 7, 8, 9, 11, 12 }));
    }
}