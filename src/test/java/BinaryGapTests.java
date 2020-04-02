import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTests {

    @Test
    public void binaryGapExampleTests() {
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(0, binaryGap.solution(15));
        assertEquals(1, binaryGap.solution(20));
        assertEquals(0, binaryGap.solution(32));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(5, binaryGap.solution(1041));
    }

    @Test
    public void binaryGapExtendedTests() {
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(1, binaryGap.solution(5));
        assertEquals(2, binaryGap.solution(9));
        assertEquals(2, binaryGap.solution(19));
        assertEquals(3, binaryGap.solution(1162));
        assertEquals(2, binaryGap.solution(51712));
        assertEquals(9, binaryGap.solution(66561));
        assertEquals(3, binaryGap.solution(561892));
        assertEquals(20, binaryGap.solution(6291457));
        assertEquals(4, binaryGap.solution(74901729));
        assertEquals(25, binaryGap.solution(805306373));
        assertEquals(5, binaryGap.solution(1376796946));
        assertEquals(29, binaryGap.solution(1073741825));
        assertEquals(28, binaryGap.solution(1610612737));
    }

}
