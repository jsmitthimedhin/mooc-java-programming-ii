
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> divisibleBy3 =  numbers.stream()
                 .filter(v -> v%3==0)
                 .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> divisibleBy2 = numbers.stream()
                .filter(v -> v%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> divisibleBy5 = numbers.stream()
                .filter(v -> v%5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        divisibleBy3.addAll(divisibleBy2);
        divisibleBy3.addAll(divisibleBy5);
        return divisibleBy3;
    }

}
