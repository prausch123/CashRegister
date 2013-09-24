/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public interface Item {
    
    public abstract double getPrice();
    
    public abstract void setPrice(double p);
    
    public abstract void setDiscount(DiscountManager d);
    
}
