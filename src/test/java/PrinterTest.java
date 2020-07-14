import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(30,10);
    }

    @Test
    public void hasPaper(){
        Integer target = 30;
        assertEquals(target ,printer.getPaper());

    }

    @Test
    public void hasToner(){
        Integer target = 10;
        assertEquals(target ,printer.getToner());

    }

    @Test
    public void printTest(){
        printer.print(2,5);
        Integer target = 20;
        assertEquals(target ,printer.getPaper());
    }

    @Test
    public void tonerTest(){
        printer.print(2,5);
        Integer target = 9;
        assertEquals(target ,printer.getToner());
    }

}
