import java.util.Collection;
import java.util.Map.Entry;

public class Display {
    
    public static void showProudcts (Products products) {
    
        Collection<Entry<Integer, Product>> productList = products.getAllProducts();

       for (Entry<Integer, Product> p : productList) {
        System.out.println(p);
       }
    }
}
