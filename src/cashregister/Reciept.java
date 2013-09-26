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
    
    public Reciept(String custID, DatabaseManager dm) {
        this.custID = custID;
        this.dm = dm;
    }
    
    
}
