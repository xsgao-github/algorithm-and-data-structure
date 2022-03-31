package ads.java.leetcode;

public class LC0011ContainerWithMostWater {

	/**
	 * Let area = min(height[left_0], height(right_0) * (right_0 - left_0). If there
	 * is another solutionleft_1 and right_1 which contains more water, then because
	 * (right_1 - left _1) < (right_1 - left_0), we need to find min(height[left_1],
	 * height(right_1) > min(height[left_0], height(right_0),. This is the logic
	 * behind 2 pointers algorithm.
	 * 
	 * @param height
	 * @return
	 */
	public int maxArea(int[] height) {
		int l = 0;
		int r = height.length - 1;
		int max = Math.min(height[l], height[r]) * (r - l);
		int tmp = 0;
		int h = 0;
		while (l < r) {
			// move smaller point inward
			if (height[l] <= height[r]) {
				h = height[l]; 
				while (height[l] <= h && l < r) {
					l++;
				}
			} else {
				h = height[r]; 
				while (height[r] <= h && l < r) {
					r--;
				}
			}
			// l & j meet
			if (l == r) {
				break;
			}

			tmp = Math.min(height[l], height[r]) * (r - l);
			if (tmp > max) {
				max = tmp;
			}
		}
		return max;
	}
}
