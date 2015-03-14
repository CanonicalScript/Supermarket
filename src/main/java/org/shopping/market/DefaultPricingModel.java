package org.shopping.market;

/**
 * Provides the default pricing model using the formula:<br><br>
 *
 *     quantity * price
 */
public class DefaultPricingModel extends PricingModel
{
    public DefaultPricingModel(int price)
    {
        super(price);
    }

    public int calculateTotal(int count)
    {
        return count * getPrice();
    }
}
