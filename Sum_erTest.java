

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Sum_erTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Sum_erTest
{
    /**
     * Default constructor for test class Sum_erTest
     */
    public Sum_erTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void positiveNumberTest()
    {
        Sum_er sum_er1 = new Sum_er(5);
        assertEquals(15, sum_er1.returnSum());
    }

    @Test
    public void negativeNumberTest()
    {
        Sum_er sum_er1 = new Sum_er(-3);
        assertEquals(-5, sum_er1.returnSum());
    }

    @Test
    public void testNEqualsOne()
    {
        Sum_er sum_er1 = new Sum_er(1);
        assertEquals(1, sum_er1.returnSum());
    }
}



