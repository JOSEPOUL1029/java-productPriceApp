
public class Clothing extends AbstractProduct {

    public Clothing(String productId, String productName, double price) {
        super(productId, productName, price);
    }

    // Polymorphism: Unique discount policy for clothing (e.g., 20% off)
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }
}
