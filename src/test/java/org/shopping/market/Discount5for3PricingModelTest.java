package org.shopping.market;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Discount5for3PricingModelTest
{
    private PricingModel model = null;

    @Before
    public void setUp() throws Exception
    {
        model = new Discount5for3PricingModel(10);
    }

    @Test
    public void testCalculateTotalFor4() throws Exception
    {
        int cost = model.calculateTotal(4);
        assertEquals(40, cost);
    }

    @Test
    public void testCalculateTotalFor5() throws Exception
    {
        int cost = model.calculateTotal(5);
        assertEquals(30, cost);
    }

    @Test
    public void testCalculateTotalFor6() throws Exception
    {
        int cost = model.calculateTotal(6);
        assertEquals(40, cost);
    }

    @Test
    public void testCalculateTotalFor10() throws Exception
    {
        int cost = model.calculateTotal(10);
        assertEquals(60, cost);
    }
}