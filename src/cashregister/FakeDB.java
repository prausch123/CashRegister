/* * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class FakeDB implements DatabaseManager{
    private Product[] products = {
        new Product("A111", "Men's Hat", 19.99, new MultipleItemDiscount(19.99, 5)),
        new Product("A112", "Men's Shirt", 25.00, new FlatRateDiscount(25.00)),
        new Product("A113", "Womens Pants", 30.00, new NoDiscount())
    };
    
    private Customer[] customers = {
        new Customer("001", "John", "Smith"),
        new Customer("002", "Jane", "Doe")
    };
    
    
    
    
    
}
