package ads.java.leetcode;

public class LC0338CountingBits {
	public int[] countBits(int n) {
		if (n == 0) {
			return new int[] {0};
		} else if (n == 1) {
			return new int[] {0, 1};
		}

		// return array
		int[] ret = new int[n + 1];

		// when this only one bit
		ret[0] = 0;
		ret[1] = 1;

		// shift position left, now the left most bit is 1, so the count of 1's can be 
		// derived from the right bits' + 1  
		int step = 1 << 1;
    	int i = 2;
    	while (i <= n) {
    		for (i = step; i < step + step && i <= n; i++) {
    			ret[i] = ret[i - step] + 1;
    		}
    		// shift to left
    		step <<= 1;
    	}
    	return ret;
    }
}
