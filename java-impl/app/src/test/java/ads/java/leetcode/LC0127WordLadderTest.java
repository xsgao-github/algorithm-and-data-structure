package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC0127WordLadderTest {

	@Test
	void test() {
		LC0127WordLadder wl = new LC0127WordLadder();
		assertEquals(5, wl.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
		assertEquals(0, wl.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log")));
		assertEquals(5,
				wl.ladderLength("qa", "sq",
						Arrays.asList("si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm",
								"le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow",
								"sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr",
								"tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh",
								"co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm",
								"an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt",
								"io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye")));
	}

}
