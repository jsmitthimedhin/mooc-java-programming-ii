
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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        list.add(task);
    }
    
    public void print() {
        int i = 1;
        for(String eachTask: list) {
            System.out.println(i + ": " + eachTask);
            i++;
        }
    }
    
    public void remove(int number) {
        int i = 1;
        for(String eachTask: list) {
            if(i==number) {
                list.remove(eachTask);
                break;
            }
            i++;
        }
    }
}
