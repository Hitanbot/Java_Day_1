
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {



    @Test
    public void addTest(){
        Integer target = 3;
        assertEquals( target , Calculator.add(2,1));

    }

    @Test
    public void subtractTest(){
        Integer target = 1;
        assertEquals(target, Calculator.subtract(2,1));

    }

    @Test
    public void multiplyTest(){
        Integer target = 6;
        assertEquals(target, Calculator.multiply(2,3));

    }

    @Test
    public void divideTest(){
        Double target = 3.0;
        assertEquals(target,Calculator.divide(6.0,2.0));

    }







}
