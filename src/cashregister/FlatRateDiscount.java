/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class FlatRateDiscount implements DiscountStrategy{
    private double discount;
    
    public FlatRateDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public double getDiscountTotal(double unitCost, int qty) {
        double total = unitCost * qty;
        double discounted = unitCost * qty * this.discount;
        return total - discounted;
    }

    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        return unitCost * qty * this.discount;
    }
    
}
