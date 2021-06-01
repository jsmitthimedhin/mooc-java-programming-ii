/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author OS
 */
public class TemperatureSensor implements Sensor {
    private boolean isOn;
    
    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        if(!isOn) {
            isOn = true;
        }
    }

    @Override
    public void setOff() {
        if(isOn) {
            isOn = false;
        }
    }

    @Override
    public int read() {
        if(isOn) {
//            Found this method online -- basically a formula which allows us to return the numbers between the range 30 & -30.
            return (int) Math.floor(Math.random()*(30-(-30)+1)+(-30));
        } else {
            throw new IllegalStateException();
        }
    }
}
