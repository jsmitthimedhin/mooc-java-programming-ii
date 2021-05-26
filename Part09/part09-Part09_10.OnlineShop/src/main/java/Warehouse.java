
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class Warehouse {
    private Map<String, Integer> productAndPrice;
    private Map<String, Integer> productAndStock;
    
    public Warehouse() {
        this.productAndPrice = new HashMap<>();
        this.productAndStock = new HashMap<>();
        
    }
    
    public void addProduct(String product, int price, int stock) {
        productAndPrice.put(product, price);
        productAndStock.put(product, stock);
    }
    
    public int price(String product) {
        if(productAndPrice.containsKey(product)) {
            return productAndPrice.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if(productAndStock.containsKey(product)) {
            return productAndStock.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if(productAndStock.containsKey(product) && productAndStock.get(product)!= 0) {
            productAndStock.replace(product, productAndStock.get(product)-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> allProducts = productAndStock.keySet();
        return allProducts;
    }
}
