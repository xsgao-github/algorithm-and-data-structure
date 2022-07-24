package ads.java.blind75;

import java.util.ArrayList;
import java.util.List;

public class LC0057InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {

		// insert
		List<int[]> insert = new ArrayList<>();
		for (int[] i : intervals) {
			if (newInterval != null && newInterval[0] < i[0]) {
				insert.add(newInterval);
				// set null to flag that this interval is inserted already
				newInterval = null;
			}
			insert.add(i);
		}
		// may append to the end
		if (newInterval != null && (intervals.length == 0 || newInterval[0] >= intervals[intervals.length - 1][0])) {
			insert.add(newInterval);
		}

		// merge
		List<int[]> merge = new ArrayList<>();
		// previous interval
		int[] prev = null;
		for (int[] i : insert) {
			if (prev == null) {
				merge.add(i);
				prev = i;
			} else {
				if (prev[1] >= i[0]) {
					// extend previous to merge
					prev[1] = Math.max(prev[1], i[1]);
				} else {
					merge.add(i);
					prev = i;
				}
			}
		}

		// return
		int[][] ret = new int[merge.size()][];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = merge.get(i);
		}
		return ret;
	}
}
