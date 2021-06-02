/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List() {
        this.values = (Type[]) new Object [10];
        this.firstFreeIndex = 0;
    }
    
    public void add(Type value) {
        if(firstFreeIndex==values.length) {
            grow();
        }
        values[firstFreeIndex] = value;
        firstFreeIndex++;
        
    }
    
    private void grow() {
        int newSize = values.length + values.length/2;
        Type[] newValues = (Type[]) new Object [newSize];
        for(int i=0; i<values.length; i++) {
            newValues[i] = values[i];
        }
        
        values = newValues;
    }
    
    public boolean contains(Type value) {
        if(indexOfValue(value)>=0) {
            return true;
        }
        return false;
    }
    
    public int indexOfValue(Type value) {
        for(int i = 0; i<firstFreeIndex; i++) {
            if(values[i].equals(value) || value == values[i]) {
                return i;
            }
        } 
        return -1;
    }
    
    public void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i<firstFreeIndex - 1; i++) {
            values[i] = values[i+1];        
        }
    }
    
    public void remove(Type value) {
        int indexOfValueToRemove = indexOfValue(value);
        if(indexOfValueToRemove < 0) {
            return;
        }
        moveToTheLeft(indexOfValueToRemove);
        firstFreeIndex--;
    }
    
    public Type value(int index) {
        if(index<0 || index>=firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index" + index + " is outside of [0, " + firstFreeIndex + "]");
        }
        return values[index];
    }
    
    public int size() {
        return firstFreeIndex;
    }
}
