package ads.java.blind75;

import java.util.HashSet;
import java.util.Set;

public class LC0003LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}

		int max = 1;
		int left = 0, right = 1;
		Set<Character> set = new HashSet<>();
		set.add(str.charAt(left));
		char c;

		while (right < str.length()) {
			c = str.charAt(right);
			if (set.contains(c)) {
				// end of non-repeating substring
				// shift left cursor
				while (str.charAt(left) != c) {
					set.remove(str.charAt(left));
					left++;
				}
				// cursor at the repeating char now - shift one more
				set.remove(c);
				left++;
			}

			// update max
			if (right - left + 1 > max) {
				max = right - left + 1;
			}

			// shift right cursor
			right++;
			set.add(c);
		}
		
		return max;
	}
}
