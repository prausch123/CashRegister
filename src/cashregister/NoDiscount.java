/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscountTotal(double unitCost, int qty) {
        return unitCost;
    }

    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        return 0;
    }
    
}
