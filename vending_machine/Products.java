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

    public void addProduct(int productNumber, Product product) {
        availableProducts.put(productNumber, product);
    }

    public Product getProduct(int productNumber) throws Exception {

        if (!availableProducts.containsKey(productNumber)) {
            throw new Exception("There are no products with number " + productNumber + " available.");
        }
        return availableProducts.get(productNumber);
    }

    public Collection<Entry<Integer, Product>> getAllProducts() {
        return availableProducts.entrySet();
    }

}
