package vending_machine;

/** 
 * This class includes items that can be 
 * found in the Vending Machine
 */

public enum Product {
    MARS(1,3.50), MILKYWAY(2,3.00), SANDWICH(3, 5.00), CHOCOLATE(4, 4.30), PEPSI(5,2.60);

    private int productNumber;
    private double productPrice;

    //Constructor of the product

    private Product (int productNumber, double productPrice) {
        this.productNumber = productNumber;
        this.productPrice = productPrice;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getProductPrice() {
        return productPrice; 
    }

   
    
    }

    

