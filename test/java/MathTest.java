import static org.junit.Assert.*;

public class MathTest {

	public int a;
	public int b;
    @Test
    public void testSimpleAddition() { 
	a=2;
	b=2;
	Assert.assertEquals(""+Math.add,""+a+b);
	}


    @Test
    public void testPositiveNegativeAddition() { 
	a=2;
	b=-2;
	Assert.assertEquals(""+Math.add,""+a+b);
	 }


    @Test
    public void testNegativePositiveAddition() { 
	a=-2;
	b=2;
	Assert.assertEquals(""+Math.add,""+a+b);
	}


    @Test
    public void testNegativeAddition() {
	a=-2;
	b=-2;
	Assert.assertEquals(""+Math.add,""+a+b);
	 }


}


