
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
public class Box implements Packable {
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box(double capacity) {
        box = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public double weight() {
        double weight = 0;
        for(Packable item: box) {
            weight = weight + item.weight();
        }
        return weight;
    }
    
    public void add(Packable item) {
        if(weight()+item.weight()<=capacity) {
            box.add(item);
        } else {
            System.out.println("Box is full");
        }
    }
    
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
    
}
