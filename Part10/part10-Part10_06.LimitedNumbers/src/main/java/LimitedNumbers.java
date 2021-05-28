
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int ans = Integer.parseInt(scanner.nextLine());
            if(ans<0) {
                break;
            }
            numberList.add(ans);
        }
        numberList.stream()
                .filter(value -> value >=1 && value<= 5)
                .forEach(value -> System.out.println(value));
    }
}
