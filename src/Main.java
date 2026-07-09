
public class Main {

    public static void main(String[] args) {
        // 1. Create individual product objects
        AbstractProduct phone = new Electronics("E101", "Smartphone", 1000.0);
        AbstractProduct jacket = new Clothing("C201", "Winter Jacket", 150.0);
        AbstractProduct snack = new Food("F301", "Gourmet Basket", 80.0);

        // 2. Calculate and display final prices individually
        System.out.println("--- Product Price Details ---");

        System.out.println("Product: " + phone.getProductName() + " | Final Price: TZS" + phone.getFinalPrice());
        System.out.println("Product: " + jacket.getProductName() + " | Final Price: TZS" + jacket.getFinalPrice());
        System.out.println("Product: " + snack.getProductName() + " | Final Price: TZS" + snack.getFinalPrice());

        // 3. Find the most expensive product using simple manual comparison
        AbstractProduct mostExpensive = phone; // Assume the phone is the most expensive initially

        if (jacket.getFinalPrice() > mostExpensive.getFinalPrice()) {
            mostExpensive = jacket;
        }

        if (snack.getFinalPrice() > mostExpensive.getFinalPrice()) {
            mostExpensive = snack;
        }

        // 4. Print the result
        System.out.println("\n------------------------------------------------");
        System.out.println("The most expensive product after discount is: "
                + mostExpensive.getProductName() + " (TZS" + mostExpensive.getFinalPrice() + ")");
    }
}
