/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author Peter
 */
public class ItemData {
    private Item[] items;
    private int curIndex = 0;
    
    public void addItem(Item i) {
        if(i == null) {
            return;
        }
        
        items[curIndex] = i;
        curIndex++;
    }
    
    
}
