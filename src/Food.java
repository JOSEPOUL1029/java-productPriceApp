
public class Food extends AbstractProduct {

    public Food(String productId, String productName, double price) {
        super(productId, productName, price);
    }

    // Polymorphism Unique discount policy for food ( 5% off)
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
