
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class ShoppingCart {
    private List<Item> shoppingCart = new ArrayList<>();
    
    public ShoppingCart() {
        
    }
    
    public void add(String product, int price) {
        if(shoppingCart.isEmpty()) {
            shoppingCart.add(new Item(product, 1, price));
        } else {
            for(Item testCase: shoppingCart) {
                if(testCase.getProduct().equals(product)) {
                    testCase.increaseQuantity();
                    return;
                }
            }
            shoppingCart.add(new Item(product, 1, price));
        }
    }
    
    public int price() {
        int total = 0;
        for(Item priceToPrint: shoppingCart) {
            total = total + priceToPrint.price();
        }
        return total;
    }
    
    public void print() {
        for(Item objectsToPrint: shoppingCart) {
            System.out.println(objectsToPrint);
        }
    }
}
