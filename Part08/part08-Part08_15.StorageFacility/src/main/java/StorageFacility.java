
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageHashMap;
    
    public StorageFacility() {
        this.storageHashMap = new HashMap<>();
    }
    public void add(String unit, String item) {
        storageHashMap.putIfAbsent(unit, new ArrayList<>());
        storageHashMap.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> emptyArray = new ArrayList<>();
        return storageHashMap.getOrDefault(storageUnit, emptyArray);
    }
    
    public void remove(String storageUnit, String item) {
        storageHashMap.get(storageUnit).remove(item);
        if(storageHashMap.get(storageUnit).isEmpty()) {
            this.storageHashMap.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> toReturn = new ArrayList<>();
        for(String e: storageHashMap.keySet()) {
            if(!e.isEmpty()) {
                toReturn.add(e);
            }
        }
        return toReturn;
    }
}
