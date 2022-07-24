package ads.java.blind75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LC0347TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		// count
		Map<Integer, Integer> m = new HashMap<>();
		for (int n : nums) {
			if (m.containsKey(n)) {
				m.put(n, Integer.valueOf(m.get(n).intValue() + 1));
			} else {
				m.put(n, Integer.valueOf(1));
			}
		}
		// sort
		List<Counter> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> e : m.entrySet()) {
			list.add(new Counter(e.getKey(), e.getValue()));
		}
		Collections.sort(list);
		// select
		int[] ret = new int[k];
		for (int i = 0; i < k; i++) {
			ret[i] = list.get(list.size() - 1 - i).num;
		}
		return ret;
	}

	private static class Counter implements Comparable<Counter> {
		int num;
		int count;

		Counter(int num, int count) {
			this.num = num;
			this.count = count;
		}

		@Override
		public int hashCode() {
			return Objects.hash(num);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Counter other = (Counter) obj;
			return num == other.num;
		}

		@Override
		public int compareTo(Counter o) {
			return this.count - o.count;
		}

	}
}
