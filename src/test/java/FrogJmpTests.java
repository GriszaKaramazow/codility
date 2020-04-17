import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrogJmpTests {

    @Test
    public void FrogJmpExampleTests() {
        FrogJmp frogJmp = new FrogJmp();
        assertEquals(3, frogJmp.solution(10, 85, 30));

    }

}
