import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import usfca.Calculator;

public class CalculatorTest {
    @Test
    public void test1() {
        Calculator calculator = new Calculator();
        int res = calculator.add(3, 4);
        assertEquals(res, 7, "Expected 7");
    }

    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        int res = calculator.add(3, -4);
        assertEquals(res, -1, "Expected -1");
    }
}
