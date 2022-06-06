import org.junit.Test;

import static org.junit.Assert.*;

public class calculateTest {

    @Test
    public void addTwoNumbers() {
        calculate calc = new calculate();
        //assertEquals(4,calc.add(2, 2));
        assertTrue(calc.add(2,2) == 4);
    }

}