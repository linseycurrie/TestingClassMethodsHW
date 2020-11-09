import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void testHasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void testCanDrink(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void testCanEmptyBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void testRefillToFull(){
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }

}
