import java.util.ArrayList;

public class Library {
    private ArrayList<IMedia> bookList = new ArrayList<IMedia>();
    private ArrayList<Author> authorList = new ArrayList<Author>();

    private ArrayList<Client> clientList = new ArrayList<Client>();

    private ArrayList<Booking> bookingList = new ArrayList<Booking>();

    public void addBook(IMedia book) {
        bookList.add(book);
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }

    public void addClient(Client client) {
        clientList.add(client);
    }

    public void addBooking(Booking booking) {
        bookingList.add(booking);
    }

    public void book(int book_id, int client_id) {
        Booking booking = new Booking();
        booking.book_id = book_id;
        booking.client_id = client_id;

        bookingList.add(booking);
    }
}
