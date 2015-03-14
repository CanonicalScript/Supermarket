package org.shopping.market;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefaultPricingModelTest
{
    private PricingModel model = null;

    @Before
    public void setUp() throws Exception
    {
        model = new DefaultPricingModel(20);
    }

    @Test
    public void testCalculateTotalFor2() throws Exception
    {
        int cost = model.calculateTotal(2);
        assertEquals(40, cost);
    }

    @Test
    public void testCalculateTotalFor4() throws Exception
    {
        int cost = model.calculateTotal(4);
        assertEquals(80, cost);
    }
}