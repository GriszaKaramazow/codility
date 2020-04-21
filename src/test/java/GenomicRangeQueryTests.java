import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GenomicRangeQueryTests {

    @Test
    public void genomicRangeQueryExampleTests() {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        assertArrayEquals(new int[] {2, 4, 1}, genomicRangeQuery.solution("CAGCCTA", new int[] {2, 5, 0}, new int[] {4, 5, 6}));
    }
}
