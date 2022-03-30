package ads.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0217ContainsSuplicate {
    public boolean containsDuplicate(int[] nums) {
//    	Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//    	return set.size() < nums.length;
    	Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
    	return false;
    }
}
