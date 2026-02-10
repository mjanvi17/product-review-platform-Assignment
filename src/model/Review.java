package model;

public class Review {
    private Product product;
    private User user;
    private int pricingFairness;
    private int longTermValue;

    public Review(Product product, User user, int pricingFairness, int longTermValue) {
        this.setProduct(product);
        this.user = user;
        this.pricingFairness = pricingFairness;
        this.longTermValue = longTermValue;
    }

    public double getBaseRating() {
        return (pricingFairness + longTermValue) / 2.0;
    }

    public User getUser() {
        return user;
    }

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}

