
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OS
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
        
    }
    
    public void start() {
        OUTER:
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break OUTER;
                case "add":
                    System.out.print("To add: ");
                    String actionToAdd = scanner.nextLine();
                    list.add(actionToAdd);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int numberToRemove = Integer.parseInt(scanner.nextLine());
                    list.remove(numberToRemove);
                    break;
                default:
                    break;
            }
        }
    }
}
