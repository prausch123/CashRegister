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
    
    public Customer findCustomer(String custID) {
        Customer cust = null;
        for(Customer c : customers) {
            if(custID.equalsIgnoreCase(c.getCustID())) {
                cust = c;
            }
        }
        
        return cust;
    }  
    
    public Product findProduct(String prodID) {
        Product prod = null;
        for(Product p : products) {
            if(prodID.equalsIgnoreCase(p.getProdID())) {
                prod = p;
            }
        }
        
        return prod;
    }
}
