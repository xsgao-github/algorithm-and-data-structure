package ads.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC202HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> vals = new HashSet<>();
		while (n != 1) {
			n = transform(n);
			if (vals.contains(n)) {
				return false;
			} else {
				vals.add(n);
			}
		}
		return true;
	}

	private int transform(int n) {
		int i = 0;
		while (n > 0) {
			i += (n % 10) * (n % 10);
			n = n / 10;
		}
		return i;
	}
}
