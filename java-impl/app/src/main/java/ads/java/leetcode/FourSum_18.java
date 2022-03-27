package ads.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSum_18 {

    static private class Duoplet {
        // indices
        private int i1;
        private int i2;
        // values
        private int v1;
        private int v2;

        private Duoplet(int[] nums, int i, int j) {
            this.i1 = i;
            this.i2 = j;
            this.v1 = nums[i];
            this.v2 = nums[j];
        }

        @Override
        public String toString() {
            return String.format("%s[%d=%d, %d=%d]", this.getClass().getSimpleName(), this.i1, this.v1, this.i2,
                    this.v2);
        }
    }

    static private class Quadruplets {
        // values
        private int v1;
        private int v2;
        private int v3;
        private int v4;

        private Quadruplets(Duoplet duo1, Duoplet duo2) {
            this.v1 = duo1.v1;
            this.v2 = duo1.v2;
            this.v3 = duo2.v1;
            this.v4 = duo2.v2;
        }

        private List<Integer> toList() {
            return Arrays.asList(this.v1, this.v2, this.v3, this.v4);
        }

        @Override
        public int hashCode() {
            int ret = this.v1;
            ret = ret * 17 + v2;
            ret = ret * 17 + v3;
            ret = ret * 17 + v4;
            return ret;
        }

        @Override
        public boolean equals(Object other) {
            if (other == null) {
                return false;
            }
            if (!(other instanceof Quadruplets)) {
                return false;
            }
            Quadruplets that = (Quadruplets) other;
            return this.v1 == that.v1 && this.v2 == that.v2 && this.v3 == that.v3 && this.v4 == that.v4;
        }
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }

        List<Quadruplets> solutions = new ArrayList<>();
        List<Duoplet> l = null;

        // O(NlogN)
        Arrays.sort(nums);

        // O(N^2)
        // sum of two number to Duoplet
        Map<Integer, List<Duoplet>> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length - 3; i++) {
            // skip repeative
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                // skip repeative
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int key = nums[i] + nums[j];
                l = map.get(key);
                if (l == null) {
                    l = new ArrayList<>();
                    map.put(key, l);
                }
                l.add(new Duoplet(nums, i, j));
            }
        }

        // tail
        for (int j = nums.length - 1; j > nums.length - 3; j--) {
            // skip repeative
            if (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                continue;
            }

            for (int i = j - 1; i >= 0; i--) {
                // skip repeative
                if (i < j - 1 && nums[i] == nums[i + 1]) {
                    continue;
                }

                int key = nums[i] + nums[j];
                l = map.get(key);
                if (l == null) {
                    l = new ArrayList<>();
                    map.put(key, l);
                }
                l.add(new Duoplet(nums, i, j));
            }
        }

        for (Map.Entry<Integer, List<Duoplet>> e : map.entrySet()) {
            int sum1 = e.getKey();
            int sum2 = target - sum1;
            l = map.get(sum2);
            if (l != null) {
                for (Duoplet duo1 : e.getValue()) {
                    for (Duoplet duo2 : l) {
                        if (duo1.i2 < duo2.i1) {
                            solutions.add(new Quadruplets(duo1, duo2));
                        }
                    }
                }
            }
        }

        List<List<Integer>> ret = new ArrayList<>();
        for (Quadruplets qua : solutions) {
            ret.add(qua.toList());
        }
        return ret;
    }

    public static void main(String... args) {
        FourSum_18 sum = new FourSum_18();
        System.out.println(sum.fourSum(new int[] { -3, -2, -1, 0, 0, 1, 2, 3 }, 0));
        // System.out.println(sum.fourSum(new int[] { 0, 0, 0, 0 }, 0));
        // System.out.println(sum.fourSum(new int[] { -3, -1, 0, 2, 4, 5 }, 0));
        // System.out.println(sum.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
        // System.out.println(sum.fourSum(new int[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2,
        // 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }, 8));
    }
}
