package ads.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0128LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		Map<Integer, Object> set = new HashMap<>();
		for (int n : nums) {
			set.put(n, Object.class);
		}

		int longest = 0;
		for (int n : nums) {
			// ignore number that is not the first number of a sequence
			if (set.containsKey(n - 1)) {
				continue;
			}
			int length = 0;
			while (set.containsKey(n)) {
				length++;
				n += 1;
			}
			longest = Math.max(longest, length);
		}

		return longest;
	}
}
