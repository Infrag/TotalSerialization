package org.obozek.totalserialization.test;

import org.obozek.totalserialization.testinit.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.obozek.totalserialization.testinit.dto.Order;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testSerialize()
    {
        Order order = new Order();
        order.setComments("Test comments");
   }
}
