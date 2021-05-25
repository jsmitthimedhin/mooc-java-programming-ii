
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.isInBox(item)==false) {
            if(item.getWeight()<=capacity) {
                items.add(item);
                capacity = capacity-item.getWeight();
            }
        } else {
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
    
}
