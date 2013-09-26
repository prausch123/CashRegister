/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class CashRegister {
    private Reciept r;
    
    private String NEW_TRANS_ERROR = "Customer ID, or DatabaseManager was null";
    private String NEW_ITEM_ERROR = "Product ID is equal to nothing";
    
    public void startNewTransaction(String custID, DatabaseManager dm) {
        if(custID == "" || custID == null || dm == null) {
            System.out.println(NEW_TRANS_ERROR);
            return;
        } 
        
        r = new Reciept(custID);
    }
    
    public void addNewItem(String prodID, int qty) {
        r.newItem(prodID, qty);
    }
    
    public void completeTransaction() {
        r.displayFinalReciept();
    }
    
}
