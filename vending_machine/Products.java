import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * This class includes items that can be
 * found in the Vending Machine.
 */
public class Products {

    private HashMap<Integer, Product> availableProducts;

    public Products() {
        this.availableProducts = new HashMap<>();
    }

    /*
     * Adds product to the vending machine 
     */
    public void addProduct(int productNumber, Product product) {
        availableProducts.put(productNumber, product);
    }

    /*
     * Checks if the product exists (by the number) in the vending
     * machine and if so gets it.
     */
    public Product getProduct(int productNumber) throws Exception {

        if (!availableProducts.containsKey(productNumber)) {
            throw new Exception("There are no products with number " + productNumber + " available.");
        }
        return availableProducts.get(productNumber);
    }

    /**
     * @return products available in the vending machine
     */
    public Collection<Entry<Integer, Product>> getAllProducts() {
        return availableProducts.entrySet();
    }

}
