
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
public class Herd implements Movable {
    private List<Movable> herdList;
    
    public Herd() {
        herdList = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable oneAnimal: herdList) {
            oneAnimal.move(dx, dy);
        }
    }
    
    public String toString() {
        String toPrint = "";
        for(Movable oneHerd: herdList) {
            toPrint = toPrint + oneHerd + "\n";
        }
        return toPrint;
    }
    
    public void addToHerd(Movable movable) {
        herdList.add(movable);
    }
    
}
