
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String ans = scanner.nextLine();
            if(ans.equals("end")) {
                break;
            }
            int number = Integer.parseInt(ans);
            System.out.println(number*number*number);
        }
    }
}
