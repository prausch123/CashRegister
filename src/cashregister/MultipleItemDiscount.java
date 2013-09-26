/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class MultipleItemDiscount implements DiscountStrategy {
    private double discountRate = .10;
    private int minQty = 5;
    
    
    public MultipleItemDiscount(double discountRate, int minQty) {
        this.discountRate = discountRate;
        this.minQty = minQty;
    }

    @Override
    public double getDiscountTotal(double unitCost, int qty) {
        double discount = 0;
        double total = unitCost * qty;
        if(qty >= minQty) {
            discount = unitCost * qty * discountRate;
            total = total - discount; 
        }
        return total;
    }

    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        double amt = 0;
        if(qty >= minQty) {
            amt = unitCost * qty * discountRate;
        }
        return amt;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }
    
}
