
public class Electronics extends AbstractProduct {

    public Electronics(String productId, String productName, double price) {
        super(productId, productName, price);
    }

    // Polymorphism: Unique discount policy for electronics (e.g., 10% off)
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}
