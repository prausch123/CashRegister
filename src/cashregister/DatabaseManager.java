/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public interface DatabaseManager {
    public abstract Customer findCustomer(String custID);
    
    public abstract Product findProduct(String prodID);
}
