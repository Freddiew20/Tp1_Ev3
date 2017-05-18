package TP2_Eva3.Tp2;
//-----------------inicio código MathTest.java---------------------
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class MathTest {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(7, 10);
    }

    @Test
    public void testPositiveNegativeAddition() { 
        math = new Math(7, -3);
        Assert.assertEquals(4, math.add());
    }

    @Test
    public void testNegativePositiveAddition() {
        math = new Math(-7, 14);
        Assert.assertEquals(7, math.add());
    }


    @Test
    public void testNegativeAddition() {
        math = new Math(-7, -3);
        Assert.assertEquals(-10, math.add());
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(17, math.add());
    } 
}

//-----------------fin código MathTest.java---------------------

