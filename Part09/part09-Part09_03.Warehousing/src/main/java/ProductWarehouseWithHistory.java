/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyList;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        historyList = new ChangeHistory();
        historyList.add(initialBalance);
    }
    
    public String history() {
        return historyList.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        double newBalance = 0;
        newBalance = balance + amount;
        historyList.add(newBalance);
        super.addToWarehouse(amount);
    }
    
    public double takeFromWarehouse(double amount) {
        double newBalance = 0;
        newBalance = balance - amount;
        historyList.add(newBalance);
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + historyList.maxValue());
        System.out.println("Smallest amount of product: " + historyList.minValue());
        System.out.println("Average: " + historyList.average());
    }
}
