
/*
 * Describes single product.
 */
public class Product {

    private String name;
    private double price;

    /*
     * Constructor of the product
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + "-" + price;
    }

}
