package org.shopping.market;

/**
 * An object implementing this interface provides the main method for checking out a series of
 * market items and calculating a total cost.
 */
public interface Supermarket
{
    /**
     * Performs the checkout process for a series of items and returns a total cost of the items. All pricing
     * models are applied.
     *
     * @param items a series of single character product codes to be checked out
     *
     * @return total cost of items
     */
    public int checkout(String items);
}
