
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
public class Hideout<T> {
    private T hideout;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide) {    
        hideout = toHide;
    }
    
    public T takeFromHideout() {
        T hiddenObject = hideout;
        hideout = null;
        return hiddenObject;
    }
    
    public boolean isInHideout() {
        if(hideout != null) {
            return true;
        }
        return false;
    }
}
