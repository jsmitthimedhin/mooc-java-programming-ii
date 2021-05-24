
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
public class IOU {
    private HashMap<String, Double> moneyOwed;
    
    public IOU() {
        this.moneyOwed = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        moneyOwed.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return moneyOwed.getOrDefault(toWhom, 0.0);
    }
}
