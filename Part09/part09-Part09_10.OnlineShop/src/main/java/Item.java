
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public String getProduct() {
        return product;
    }


    
    public int price() {
        return unitPrice * qty;
    }
    
    public void increaseQuantity() {
        qty = qty + 1;
    }
    
    public String toString() {
        return product + ": " + qty;
    }
    
}
