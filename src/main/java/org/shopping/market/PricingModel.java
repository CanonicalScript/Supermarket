package org.shopping.market;

/**
 * Base pricing model containing an items base price.
 */
public abstract class PricingModel
{
    /** Base price. */
    private int price;

    /**
     * Creates a new base pricing model with a specified price.
     *
     * @param price item price
     */
    public PricingModel(int price)
    {
        this.price = price;
    }

    /**
     * Calculates the total cost for the specified number of items using the current pricing model.
     *
     * @param count item count
     */
    public abstract int calculateTotal(int count);

    /**
     * Returns the items unit price.
     *
     * @return item's unit price
     */
    public int getPrice()
    {
        return price;
    }
}
