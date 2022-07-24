package ads.java.blind75;

public class LC0238ProductOfArrayExceptItself {
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] pre = new int[len];
		int[] suf = new int[len];
		int[] ret = new int[len];
		pre[0] = nums[0];
		for (int i = 1; i < len - 1; i++) {
			pre[i] = pre[i - 1] * nums[i];
		}
		suf[len - 1] = nums[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			suf[i] = suf[i + 1] * nums[i];
		}
		ret[0] = suf[1];
		ret[len - 1] = pre[len - 2];
		for (int i = 1; i < len - 1; i++) {
			ret[i] = pre[i - 1] * suf[i + 1];
		}
		return ret;
	}
}
