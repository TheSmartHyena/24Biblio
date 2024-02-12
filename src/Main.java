import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        IMedia book1 = new Book("Java Programming");
        IMedia book2 = new Book( "Data Structures and Algorithms");

        Client john = new Client("John");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(john.toString());

        library.book(((Book) book1).id, john.id);
    }
}