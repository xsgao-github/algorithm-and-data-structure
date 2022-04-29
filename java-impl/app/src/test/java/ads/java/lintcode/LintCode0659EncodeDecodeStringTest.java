package ads.java.lintcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class LintCode0659EncodeDecodeStringTest {

	@Test
	void testEncodeDecode() {
		LintCode0659EncodeDecodeString obj = new LintCode0659EncodeDecodeString();
		List<String> input = Stream.of("lint", "code", "love", "you").collect(Collectors.toList());
		assertEquals(input, obj.decode(obj.encode(input)));
	}

}
