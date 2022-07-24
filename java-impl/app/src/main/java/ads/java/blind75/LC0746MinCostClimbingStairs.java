package ads.java.blind75;

public class LC0746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
    	int c0 = cost[0];
    	int c1 = cost[1];
    	int c2 = 0;
    	for (int i = 2; i < cost.length; i++) {
    		c2 = Math.min(c0, c1) + cost[i];
    		c0 = c1;
    		c1 = c2;
    	}
    	return Math.min(c0, c1);
    }
}
