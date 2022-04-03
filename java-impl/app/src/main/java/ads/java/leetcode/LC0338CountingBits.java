package ads.java.leetcode;

public class LC0338CountingBits {
	public int[] countBits(int n) {
		if (n == 0) {
			return new int[] {0};
		} else if (n == 1) {
			return new int[] {0, 1};
		}

		int[] ret = new int[n + 1];
		ret[0] = 0;
		ret[1] = 1;

		int step = 2;
    	int i = 2;
    	int j = 2;
    	while (i <= n) {
    		for (j = i; j < step + i && j <= n; j++) {
    			ret[j] = ret[j - step] + 1;
    		}
    		i = j;
    		step <<= 1;
    	}
    	return ret;
    }
}
