/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.startNewTransaction("001", new FakeDB());
        cr.addNewItem("A111", 2);
        cr.addNewItem("A112", 1);
        cr.completeTransaction();
    }
}
