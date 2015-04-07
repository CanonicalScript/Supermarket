package org.shopping.market;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarketTest
{
    private Market market = null;

    @Before
    public void setUp() throws Exception
    {
        market = new Market();
    }

    @Test
    public void testCheckoutCart1() throws Exception
    {
        int cost = market.checkout("ABBACBBAB");
        assertEquals(240, cost);
    }

    @Test
    public void testCheckoutCart2() throws Exception
    {
        int cost = market.checkout("ABBACBBABCCBBA");
        assertEquals(420, cost);
    }

    @SuppressWarnings("unused")
    @Test(expected = IllegalStateException.class)
    public void testCheckoutIllegalProduct() throws Exception
    {
        int cost = market.checkout("ABCDE");
    }
}