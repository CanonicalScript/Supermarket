package org.shopping.market;

import java.util.HashMap;
import java.util.Map;

/**
 * Implements Supermarket
 */
public class Market implements Supermarket
{
    /** Market items. */
    private Map<String, Product> marketItems = new HashMap<String, Product>();

    /**
     * Creates a new instance of the market.
     */
    public Market()
    {
        initializeMarket();
    }

    /**
     * Performs the checkout process for a series of items and returns a total cost of the items.
     *
     * @param items a series of single character product codes to be checked out
     *
     * @return total cost of items
     */
    public int checkout(String items)
    {
        /* check for null */
        if (items == null) throw new IllegalStateException("Checkout items cannot be null.");

        /* uppercase items */
        items = items.toUpperCase();

        /* create count of each item sold */
        Map<String, Integer> itemCount = new HashMap<String, Integer>();
        for (char c : items.toCharArray())
        {
            /* get string value of id */
            String id = String.valueOf(c);

            /* check for product in market */
            if (!marketItems.containsKey(id)) throw new IllegalStateException("The product id \"" + id + "\" does not exist.");

            /* get count and increment */
            int count = itemCount.containsKey(id) ? itemCount.get(id) : 0;
            count += 1;
            itemCount.put(id, count);
        }

        /* determine total cost */
        int cost = 0;
        for (String id : itemCount.keySet())
        {
            /* get product matching the id */
            Product product = marketItems.get(id);

            /* get total purchased */
            int quantity = itemCount.get(id);

            /* add to total */
            cost += product.getPricingModel().calculateTotal(quantity);
        }

        /* return total */
        return cost;
    }

    /**
     * Initializes market catalog.
     */
    private void initializeMarket()
    {
        /* add market product items */
        marketItems.put("A", new Product("A", new DefaultPricingModel(20)));
        marketItems.put("B", new Product("B", new Discount5for3PricingModel(50)));
        marketItems.put("C", new Product("C", new DefaultPricingModel(30)));
    }
}
