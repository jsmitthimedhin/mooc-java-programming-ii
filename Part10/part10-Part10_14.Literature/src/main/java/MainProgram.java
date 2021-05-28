
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                System.out.println("");
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, age));
            System.out.println("");
        }
        System.out.println(books.size() + " books in total." + "\n");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);
        
        Collections.sort(books, comparator);
        
        System.out.println("Books:");
        books.stream()
                .forEach(book -> System.out.println(book));
    }

}
