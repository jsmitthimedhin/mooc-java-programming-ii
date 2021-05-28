
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type end to stop.");
        while(true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            
            inputs.add(row);
        }
        double posAverage = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(s -> s>0)
        .average()
        .getAsDouble();
        
        double negAverage = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .filter(s -> s<0)
        .average()
        .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ans = scanner.nextLine();
        if(ans.equals("n")) {
            System.out.println("Average of the negative numbers: " + negAverage);
        } else if (ans.equals("p")) {
            System.out.println("Average of the positive numbers: " + posAverage);
        }
    }
}
