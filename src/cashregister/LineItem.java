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
    
    public LineItem(String prodID, int qty) {
        this.prodID = prodID;
        this.qty = qty;
    }
    
    
}
