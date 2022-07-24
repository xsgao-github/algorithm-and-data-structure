package ads.java.blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC0049GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<Map<Character, Integer>, List<String>> ret = new HashMap<>();
		for (String str : strs) {
			Map<Character, Integer> m = new HashMap<>();
			for (char c : str.toCharArray()) {
				if (m.containsKey(c)) {
					m.put(c, Integer.valueOf(m.get(c).intValue() + 1));
				} else {
					m.put(c, Integer.valueOf(1));
				}
			}

			if (ret.containsKey(m)) {
				ret.get(m).add(str);
			} else {
				List<String> l = new ArrayList<>();
				l.add(str);
				ret.put(m, l);
			}
		}
		return new ArrayList<>(ret.values());
	}
}
