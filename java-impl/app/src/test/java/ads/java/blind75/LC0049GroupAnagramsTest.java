package ads.java.blind75;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class LC0049GroupAnagramsTest {

	@Test
	void testGroupAnagrams() {
		LC0049GroupAnagrams obj = new LC0049GroupAnagrams();

		List<List<String>> actual = obj.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
		sort(actual);
		List<List<String>> expect = new ArrayList<>();
		expect.add(Arrays.asList(new String[] { "bat" }));
		expect.add(Arrays.asList(new String[] { "nat", "tan" }));
		expect.add(Arrays.asList(new String[] { "ate", "eat", "tea" }));
		assertEquals(expect.toString(), actual.toString());

		actual = obj.groupAnagrams(new String[] { "" });
		sort(actual);
		expect = new ArrayList<>();
		expect.add(Arrays.asList(new String[] { "" }));
		assertEquals(expect.toString(), actual.toString());

		actual = obj.groupAnagrams(new String[] { "a" });
		sort(actual);
		expect = new ArrayList<>();
		expect.add(Arrays.asList(new String[] { "a" }));
		assertEquals(expect.toString(), actual.toString());
	}

	void sort(List<List<String>> list) {
		for (List<String> l : list) {
			l.sort(String.CASE_INSENSITIVE_ORDER);
		}

		Comparator<List<String>> com = new Comparator<List<String>>() {
			@Override
			public int compare(List<String> o1, List<String> o2) {
				if (o1.size() != o2.size()) {
					return o1.size() - o2.size();
				}
				return o1.toString().compareTo(o2.toString());
			}
		};

		list.sort(com);
	}
}
