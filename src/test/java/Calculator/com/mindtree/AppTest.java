package Calculator.com.mindtree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAdd1Plus1() 
    {
        int x  = 1 ; int y = 1;
        assertEquals(2, App.add(x,y));
    }
    
    @Test
    public void testSubtract() {
    int a = 25; int b = 20; 
    int expectedResult = 5; 
    long result = App.sub(a, b);
    assertEquals(expectedResult, result);
    }
    
    @Test
    public void testMultiply() {
    int a = 10; int b = 25;
    long expectedResult = 250;
    long result = App.mul(a, b);
    assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
    int a = 56; int b = 10; 
    double expectedResult = 5.6; 
    double result = App.div(a, b);
    assertEquals(expectedResult, result,0.00005); 
    }
}
