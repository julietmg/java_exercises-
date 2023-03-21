public class Main {


    public static void main (String[] args) throws Exception {

        System.out.println("Hello! What would you like to buy today?");

        Products products = new Products();
        products.addProduct(35, new Product("Snickers", 3.20));
        products.addProduct(270, new Product("Lays", 1.49));
        products.addProduct(162, new Product("Cola", 5.00));
        products.addProduct(4, new Product("Water", 2.50));
        products.addProduct(17, new Product("Kinder joy", 2.60));

        Display.showProudcts(products);

        System.out.print("My choice is: ");
        int productNumber = Integer.parseInt(System.console().readLine()); 
        
        products.getProduct(productNumber);

    }
    
}
