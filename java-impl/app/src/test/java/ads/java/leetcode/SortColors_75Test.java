package ads.java.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortColors_75Test {

	@BeforeEach
    public void setUp() throws Exception {
    }

	@AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testSortColors() {
        SortColors_75 sc = new SortColors_75();
        int[] output = null;

        int[] input = new int[] { 2, 0, 2, 1, 1, 0 };
        int[] expect = new int[] { 0, 0, 1, 1, 2, 2 };
        sc.sortColors(input);
        output = input;
        assertArrayEquals(output, expect);

        input = new int[] { 2, 0, 1 };
        expect = new int[] { 0, 1, 2 };
        sc.sortColors(input);
        output = input;
        assertArrayEquals(output, expect);
    }

}
