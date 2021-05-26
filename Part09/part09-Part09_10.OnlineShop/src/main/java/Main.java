
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); 
        cart.add("milk",3); 
        cart.add("sausage",7); 
        cart.add("milk",3); 
        cart.add("milk",3); 
        cart.add("sausage",7); 
        cart.add("cream", 2);
        cart.print();
    }
}
