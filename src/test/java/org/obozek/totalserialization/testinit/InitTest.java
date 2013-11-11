package org.obozek.totalserialization.testinit;

import java.io.IOException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.obozek.totalserialization.SerializedObjectWrapper;
import org.obozek.totalserialization.TotalSerialization;
import org.obozek.totalserialization.TotalSerializationImpl;
import org.obozek.totalserialization.testinit.dto.Order;

/**
 * Unit test for simple App.
 */
public class InitTest extends TestCase
{

    private TotalSerialization ts = new TotalSerializationImpl();

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public InitTest(String testName)
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(InitTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testSerialize()
    {
        Order order = new Order();
        order.setComments("Test comments");
        try {
            SerializedObjectWrapper sow = ts.serializeObjectWithClass(order);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
