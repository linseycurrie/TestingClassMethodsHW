import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50,100);
    }

    @Test
    public void testHasPages(){
        assertEquals(50, printer.getPages());
    }

    @Test
    public void testPrint(){
        printer.printPages(5,5);
        assertEquals(25, printer.getPages());
    }

    @Test
    public void testToner(){
        printer.printPages(5,5);
        assertEquals(75, printer.getToner());
    }
}
