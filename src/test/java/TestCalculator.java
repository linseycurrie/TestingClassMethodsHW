import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(15, calc.add(5,10));
    }

    @Test
    public void testSubtract(){
        assertEquals(5, calc.subtract(10,5));
    }

    @Test
    public void testMultiply(){
        assertEquals(25, calc.multiply(5,5));
    }

    @Test
    public void testDivide(){
        assertEquals(4.6, calc.divide(23, 5), 0.01);
    }

}
