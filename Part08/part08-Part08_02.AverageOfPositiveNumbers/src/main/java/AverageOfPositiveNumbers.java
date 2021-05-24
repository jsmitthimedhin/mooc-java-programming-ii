
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        while(true) {
            int input = Integer.parseInt(scanner.nextLine());
            if(input==0) {
                break;
            } else if(input>0) {
                sum = sum + input;
                i++;
            } 
        } 
        if(sum<=0) {
            System.out.println("Cannot calculate average");
        } else {
            double average = (double) sum/i;
            System.out.println(average);
        }
    }
}
