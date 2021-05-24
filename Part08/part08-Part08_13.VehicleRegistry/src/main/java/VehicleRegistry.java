
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> liPlatehashMap;
    
    public VehicleRegistry() {
        this.liPlatehashMap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        for(LicensePlate e: liPlatehashMap.keySet()) {
            if(e.equals(licensePlate)) {
                return false;
            }
        }
        liPlatehashMap.put(licensePlate, owner);
        return true;
     }
    
    public String get(LicensePlate licensePlate) {
        return liPlatehashMap.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(liPlatehashMap.containsKey(licensePlate)) {
            liPlatehashMap.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        for(LicensePlate e: liPlatehashMap.keySet()) {
            System.out.println(e);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for(String e: liPlatehashMap.values()) {
            if(!ownerList.contains(e)) {
                ownerList.add(e);
            }
        }
        for(String e: ownerList) {
            System.out.println(e);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.liPlatehashMap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRegistry other = (VehicleRegistry) obj;
        if (!Objects.equals(this.liPlatehashMap, other.liPlatehashMap)) {
            return false;
        }
        return true;
    }
}
