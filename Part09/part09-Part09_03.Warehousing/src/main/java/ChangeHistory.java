
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
public class ChangeHistory {
    private ArrayList<Double> historyList;
    
    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }
    
    public void add(double status) {
        historyList.add(status);
    }
    
    public void clear() {
        historyList.clear();
    }
    
    public double maxValue() {
        if(historyList.isEmpty()) {
            return 0.0;
        } else {
            double largestValue = 0;
            for(double testSubject: historyList) {
                if(largestValue<testSubject) {
                largestValue = testSubject;
                }
            }
            return largestValue;
        }
    }
    
    public double minValue() {
        if(historyList.isEmpty()) {
            return 0.0;
        } else {
            double smallestValue = Double.MAX_VALUE;
            for(double testSubject: historyList) {
                if(smallestValue>testSubject) {
                smallestValue = testSubject;
                }
            }
            return smallestValue;
        }
    }
    
    public double average() {
        if(historyList.isEmpty()) {
            return 0.0;
        } else {
            double sum = 0;
            int i = 0;
            for(double testSubject: historyList) {
                sum = sum + testSubject;
                i++;
            }
            double average = sum/i;
            return average;
        }
    }
    
    public String toString() {
        return historyList.toString();
    }
    
    
}
