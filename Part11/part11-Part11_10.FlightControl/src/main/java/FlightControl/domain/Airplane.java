/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author OS
 */
public class Airplane {
    private String ID;
    private int capacity;
    
    public Airplane(String ID, int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }
    
    public String getID() {
        return ID;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public String toString() {
        return ID + " (" + capacity + " capacity)";
    }
    
}
