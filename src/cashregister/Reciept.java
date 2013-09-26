/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class Reciept {
    private String custID;
    private DatabaseManager dm;
    private LineItem[] items;
    
    public Reciept(String custID) {
        this.custID = custID;
        this.dm = new FakeDB();
    }
    
    public void newItem(String prodID, int qty) {
        LineItem i = new LineItem(prodID, qty, this.dm);
        LineItem[] temp = new LineItem[items.length + 1];
        
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[items.length] = i;
        items = temp;
    }
    
    public Customer getCustomer(String custID) {
        Customer c = dm.findCustomer(custID);
        
        if(c == null) {
            System.out.println("Customer you are trying to find is null!");
        }
        
        return c;
    }
    
    public Product getProduct(String prodID) {
        Product p = dm.findProduct(prodID);
        
        if(p == null) {
            System.out.println("The product you are trying to find is null!");
        }
        
        return p;
    }
    
    private double getTotalPrice() {
        double total = 0;
        
        for(LineItem l : items) {
            total = total + l.getProdTotalAfterDiscount();
        }
        
        return total;
    }
    
    private double getSavedAmount() {
        double beforeSaved = getTotalPrice();
        double amountSaved = 0;
        
        for(LineItem l : items) {
            amountSaved = amountSaved + l.getProdDiscount();
        }
        
        return beforeSaved - amountSaved;
    }
    
    public void displayFinalReciept() {
        
    }
    
}
