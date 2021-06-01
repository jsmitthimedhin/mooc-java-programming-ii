/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OS
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> averages = new ArrayList<>();
    
    public AverageSensor() {
        
    }
    
     public void addSensor(Sensor toAdd) {
         sensors.add(toAdd);
     }
     
     public boolean isOn() {
         for(Sensor eachSensor: sensors) {
             if(eachSensor.isOn() == true) {
                 return true;
             } else {
                 break;
             }
         }
         return false;
     }
     
     public void setOn() {
        for(Sensor eachSensor: sensors) {
            eachSensor.setOn();
        }
    }
     
     public void setOff() {
         for(Sensor eachSensor: sensors) {
            eachSensor.setOff();
         }
     }
     
     public int read() {
         if(!isOn() || sensors.isEmpty()) {
             throw new IllegalStateException("Average Sensor is off.");
         }
         int sum = 0;
         for(Sensor eachSensor: sensors) {
             sum = sum + eachSensor.read();
         }
         int avg = sum/sensors.size();
         averages.add(avg);
         return avg;
     }
     
     public List<Integer> readings() {
         return averages;
     }
}
