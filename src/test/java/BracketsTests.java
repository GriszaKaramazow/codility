import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketsTests {

    @Test
    public void bracketsExampleTest() {
        Brackets brackets = new Brackets();
        assertEquals(0, brackets.solution("([)()]"));
        assertEquals(1, brackets.solution("{[()()]}"));
        assertEquals(0, brackets.solution("{{{{"));
        assertEquals(1, brackets.solution("({{({}[]{})}}[]{})"));
    }
}
