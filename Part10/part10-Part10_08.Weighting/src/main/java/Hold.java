

import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase Suitcase) {
        if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
            return;
        }

        this.suitcases.add(Suitcase);
    }

    public int totalWeight() {
//        int sum = 0;
//        int index = 0;
//        while (index < this.suitcases.size()) {
//        sum += this.suitcases.get(index).totalWeight();
//        index++;
//        }
//        return sum;
          int sum = suitcases.stream()
                  .map(suitcase -> suitcase.totalWeight())
                  .reduce(0, (previousSum, value) -> previousSum + value);
          return sum;
    }

    public void printItems() {
//        int index = 0;
//        while (index < this.suitcases.size()) {
//        this.suitcases.get(index).printItems();
//        index++;
        suitcases.stream()
                .forEach(suitcase -> suitcase.printItems());
        }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
