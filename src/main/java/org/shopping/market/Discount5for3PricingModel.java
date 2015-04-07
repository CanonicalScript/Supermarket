package org.shopping.market;

/**
 * Provides a discount pricing model of 5 items for the price of 3. Items that cannot be grouped
 * into 5 cost full price.  For example given a price of 10<br><br>
 *
 *    4 items = 40
 *    5 items = 30
 *    6 items = 40
 *   10 items = 60
 */
public class Discount5for3PricingModel extends PricingModel
{
    public Discount5for3PricingModel(int price)
    {
        super(price);
    }

    public int calculateTotal(int count)
    {
        /* calculate cost of group discounted  */
        int discountCost = (count / 5) * (getPrice() * 3);

        /* calculate cost of non-discounted items */
        int nonDiscountCost = (count % 5) * getPrice();

        /* return total cost */
        return discountCost + nonDiscountCost;
    }
}
