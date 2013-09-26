/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class Product {
    private String prodID;
    private String prodName;
    private double prodPrice;
    private DiscountStrategy discount;
    
    public Product(String prodID, String prodName, double prodPrice, DiscountStrategy discount) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.discount = discount;
    }

    public String getProdID() {
        return prodID;
    }
    
    public DiscountStrategy getDiscountStrat() {
        return this.discount;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }
    
    
}
