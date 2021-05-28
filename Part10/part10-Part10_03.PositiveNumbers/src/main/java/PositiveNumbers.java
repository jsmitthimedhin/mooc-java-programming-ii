
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the numbers here");
        List<Integer> input = new ArrayList<>();
        while(true) {
            String ans = scanner.nextLine();
            if(ans.equals("end")) {
                break;
            }
            int ansAsInt = Integer.parseInt(ans);
            input.add(ansAsInt);
        }
        System.out.println(positive(input));
    }
    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positiveInputList = numbers.stream()
        .filter(s -> s>0)
        .collect(Collectors.toCollection(ArrayList::new));
        return positiveInputList;
    }
}
