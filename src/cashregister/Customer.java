/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String custID;
    
    public Customer(String custID, String firstName, String lastName) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }
    
    
}
