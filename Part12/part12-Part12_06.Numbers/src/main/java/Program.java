
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int amount = Integer.parseInt(scanner.nextLine());
            for(int i = 0; i<amount; i++) {
                Random number = new Random();
                int randomNumber = number.nextInt(11);
                System.out.println(randomNumber);
        }
    }

}
