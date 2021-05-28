
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String ans = scanner.nextLine();
            if(ans.isEmpty()) {
                break;
            }
            inputs.add(ans);
        }
        inputs.stream()
                .forEach(name -> System.out.println(name));
    }
}
