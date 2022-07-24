package ads.java.blind75;

public class LC0070ClimbingStairs {
    public int climbStairs(int n) {
    	if (n == 1) {
    		return 1;
    	} else if (n == 2) {
    		return 2;
    	}
    	int s2 = 1;
    	int s1 = 2;
    	int s = 0;
    	for (int i = 3; i <= n; i++) {
    		s = s2 + s1;
    		s2 = s1;
    		s1 = s;
    	}
    	return s;
    }
}
