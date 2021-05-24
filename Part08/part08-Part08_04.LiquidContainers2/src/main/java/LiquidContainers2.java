
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        while (true) {
            System.out.println("First: " + container1.contains() + "/100");
            System.out.println("Second: " + container2.contains() + "/100");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.parseInt(parts[1]);
                
//                Adding to container 1
                if(command.equals("add")) {
                    container1.add(amount);
                }
//                Moving container 1 amount to container 2
                if(command.equals("move")) {
                    if(container1.contains()-amount<=0) {
                        container2.add(container1.contains());
                        container1.remove(amount);
                    } else {
                        container1.remove(amount);
                        container2.add(amount);
                    }
                }
//                Removing from container 2
                if(command.equals("remove")) {
                    container2.remove(amount);
                }
            }
        }
    }
}
