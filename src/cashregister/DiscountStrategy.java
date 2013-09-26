package cashregister;

/**
 * The general contract for all implementation of discount strategies.
 * @author Peter
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountTotal(double unitCost, int qty);
            
    public abstract double getDiscountAmt(double unitCost, int qty);
    
    
}
