
public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(5);

        box1.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box1.add(new Book("Robert Martin", "Clean Code", 1));
        box1.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box2.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        box2.add(new Book("Anonymous", "Holy Bible", 4));
        box1.add(box2);
        System.out.println(box1);
    }
}
