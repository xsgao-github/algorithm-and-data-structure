package ads.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LC0380InsertDeleteGetRandom {
	/**
	 * Your RandomizedSet object will be instantiated and called as such:
	 * 
	 * <pre>
	 * RandomizedSet obj = new RandomizedSet();
	 * boolean param_1 = obj.insert(val);
	 * boolean param_2 = obj.remove(val);
	 * int param_3 = obj.getRandom();
	 * </pre>
	 */
	public static class RandomizedSet {
		// to keep track value to index pairs
		private Map<Integer, Integer> map = new HashMap<>();
		// keep all values in a compact array
		private ArrayList<Integer> values = new ArrayList<>();
		// random number generator
		private Random random = new Random(System.currentTimeMillis());

		public RandomizedSet() {
		}

		public boolean insert(int val) {
			if (map.containsKey(val)) {
				return false;
			} else {
				map.put(val, map.size());
				values.add(val);
				return true;
			}
		}

		public boolean remove(int val) {
			Integer index = map.remove(val);
			if (index != null) {
				if (index == values.size() - 1) {
					// remove the last one
					values.remove(values.size() - 1);
				} else {
					// move the last value to current position
					Integer lastValue = values.remove(values.size() - 1);
					values.set(index, lastValue);
					// and update lastValue's index
					map.put(lastValue, index);
				}
				return true;
			} else {
				return false;
			}
		}

		public int getRandom() {
			return values.get(random.nextInt(values.size()));
		}
	}
}
