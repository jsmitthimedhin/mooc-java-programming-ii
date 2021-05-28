
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        Checker checker = new Checker();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String ans = scanner.nextLine();
        if(checker.timeOfDay(ans)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
