
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
//        int sum = 0;
//        int counter = 0;
//        while (counter < this.Items.size()) {
//        sum += this.Items.get(counter).getWeight();
//        counter++;
//        }
//        return sum;
        int sum = Items.stream()
                .map(item -> item.getWeight())
                .reduce(0, (previousSum, value) -> previousSum + value);
        return sum;
    }

    public void printItems() {
//        int index = 0;
//        while (index < this.Items.size()) {
//        Item t = this.Items.get(index);
//        System.out.println(t);
//        index++;
//        }
        Items.stream()
                .forEach(item -> System.out.println(item));
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
