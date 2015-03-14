package org.shopping.market;

/**
 * A market product.
 */
public class Product
{
    /** Product id. */
    private String id;

    /** Product pricing model. */
    private PricingModel pricingModel;

    /**
     * Creates a new product with the specified id.
     *
     * @param id product identifier
     */
    public Product(String id)
    {
        this.id = id;
    }

    /**
     * Creates a new product with the specified id and pricing model.
     *
     * @param id product identifier
     * @param pricingModel pricing model
     */
    public Product(String id, PricingModel pricingModel)
    {
        this.id = id;
        this.pricingModel = pricingModel;
    }

    public String getId()
    {

        return id;
    }

    public PricingModel getPricingModel()
    {
        return pricingModel;
    }

    public void setPricingModel(PricingModel pricingModel)
    {
        this.pricingModel = pricingModel;
    }
}
