/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class FakeDB implements DatabaseManager{
    private LineItem[] items;
    private int curIndex = 0;
    
    public void addItem(LineItem i) {
        if(i == null) {
            return;
        }
        
        items[curIndex] = i;
        curIndex++;
    }
    
    public LineItem[] getItemList() {
        return this.items;
    }
    
}
