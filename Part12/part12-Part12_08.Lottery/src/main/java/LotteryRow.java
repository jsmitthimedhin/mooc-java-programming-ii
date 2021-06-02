
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random randomNums = new Random();
        int i = 0;
        while(i<7) {
            int lotteryNumber = randomNums.nextInt(40) +1;
            if(!containsNumber(lotteryNumber)) { 
                numbers.add(lotteryNumber);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        if(numbers.contains(number)) {
            return true;
        }
        return false;
    }
    
}

