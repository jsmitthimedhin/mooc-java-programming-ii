
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
public class Pipe<T> {
    private ArrayList<T> pipeObjects;
    
    public Pipe() {
        this.pipeObjects = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        pipeObjects.add(value);
    }
    
    public T takeFromPipe() {
        if(pipeObjects.isEmpty()) {
            return null;
        }
        T takenObject = pipeObjects.get(0);
        pipeObjects.remove(0);
        return takenObject;
    }
    
    public boolean isInPipe() {
        if(pipeObjects.isEmpty()) {
            return false;
        } 
        return true;
    }
    
}
