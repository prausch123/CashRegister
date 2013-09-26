/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class LineItem {
    private int qty;
    private String prodID;
    private Product product;
    private DatabaseManager db;
    
    public LineItem(String prodID, int qty, DatabaseManager db) {
        this.prodID = prodID;
        this.qty = qty;
        this.db = db;
        this.product = db.findProduct(prodID);
    }
    
    public Product getProduct(String prodID) {
        Product p = db.findProduct(prodID);
        
        if(p == null) {
            System.out.println("Prodct you're searching for in cashregister.Lineitem doesn't exist!");
        }
        
        return p;
    }
    
    public double getProductPrice() {
        return product.getProdPrice();
    }
    
    public double getProdDiscount() {
        return product.getDiscountStrat().getDiscountAmt(product.getProdPrice(), this.qty);
    }
    
    public double getProdTotalAfterDiscount() {
        return product.getDiscountStrat().getDiscountTotal(product.getProdPrice(), this.qty);
    }
    
    public int getQty() {
        return qty;
    }

    public String getProdID() {
        return prodID;
    }
    
    
}
