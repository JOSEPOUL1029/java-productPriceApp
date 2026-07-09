
public abstract class AbstractProduct {

    // Encapsulation: Private fields accessible only via getters
    private String productId;
    private String productName;
    private double price;

    public AbstractProduct(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Abstraction: Abstract method to be implemented by specific categories
    public abstract double calculateDiscount();

    // Template method utilizing polymorphism
    public double getFinalPrice() {
        return this.price - calculateDiscount();
    }
}
