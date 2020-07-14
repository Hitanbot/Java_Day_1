import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle();
    }

    @Test
    public void volumeIs100(){
        Integer target = 100;
        assertEquals(target ,waterbottle.getVolume());

    }

    @Test
    public void drinkTest(){
        Integer target = 90;
        waterbottle.drink();
        assertEquals(target ,waterbottle.getVolume());

    }

    @Test
    public void emptyTest(){
        Integer target = 0;
        waterbottle.empty();
        assertEquals(target ,waterbottle.getVolume());

    }

    @Test
    public void fillTest(){
        Integer target = 100;
        waterbottle.drink();
        waterbottle.fill();
        assertEquals(target ,waterbottle.getVolume());

    }



}
