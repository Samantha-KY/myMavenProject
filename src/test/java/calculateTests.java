import org.junit.Test;

import static org.junit.Assert.*;

public class calculateTests {

    @Test
    public void add() {
        calculate calc = new calculate();
        assertEquals(4,calc.add(2,2));
    }
}