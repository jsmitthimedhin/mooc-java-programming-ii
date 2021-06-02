
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
public class HashMap<K, V> {
    
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;
    
    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if(values[hashValue] == null)
            return null;
        List<Pair<K,V>> valuesAtIndex = values[hashValue];
        for(int i = 0; i < valuesAtIndex.size(); i++) {
            if(valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        
        return null;
    }
    
    private List<Pair<K,V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() & values.length);
        if(values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
        
        return values[hashValue];
    }
    
    private int getIndexOfKey(List<Pair<K,V>> myList, K key) {
        for (int i = 0; i<myList.size(); i++) {
            if(myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if(index<0) {
            valuesAtIndex.add(new Pair<>(key, value));
            firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        
        if(1.0 * firstFreeIndex / values.length > 0.75) {
            grow();
        }
    }
    
    public void grow() {
        List<Pair<K, V>>[] newArray = new List[values.length*2];
        for(int i = 0; i<values.length; i++) {
            copy(newArray, i);
        }
        values = newArray;
    }
    
    public void copy(List<Pair<K,V>>[] newArray, int fromIndex) {
        for(int i = 0; i < values[fromIndex].size(); i++) {
            Pair<K,V> value = values[fromIndex].get(i);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if(newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }
            
            newArray[hashValue].add(value);
        }
    }
    
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.isEmpty()) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
    
    
    
}
