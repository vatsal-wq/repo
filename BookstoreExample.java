import java.util.logging.Logger;

public class BookstoreExample {
    private static final Logger logger = Logger.getLogger(BookstoreExample.class.getName());

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Add 10 books with their respective prices to the inventory
        bookstore.addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch", 45.00), 10);
        bookstore.addBook(new Book("978-0596009205", "Head First Java", "Kathy Sierra, Bert Bates", 30.00), 8);
        bookstore.addBook(new Book("978-0134494166", "Clean Code", "Robert C. Martin", 50.00), 5);
        bookstore.addBook(new Book("978-0321356680", "Java Concurrency in Practice", "Brian Goetz", 55.00), 7);
        bookstore.addBook(new Book("978-1617294945", "Java: The Complete Reference", "Herbert Schildt", 60.00), 12);
        bookstore.addBook(new Book("978-0132350884", "Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 40.00), 3);
        bookstore.addBook(new Book("978-1491950357", "Learning Java", "Patrick Niemeyer, Daniel Leuck", 35.00), 9);
        bookstore.addBook(new Book("978-0134685992", "Effective Java (2nd Edition)", "Joshua Bloch", 45.00), 4);
        bookstore.addBook(new Book("978-1492037255", "Java Performance: The Definitive Guide", "Scott Oaks", 47.00), 6);
        bookstore.addBook(new Book("978-0134685993", "Effective Java (3rd Edition)", "Joshua Bloch", 45.00), 2);

        // Display the initial inventory of the bookstore
        bookstore.displayInventory();

        // Remove some books from the bookstore
        bookstore.removeBook(new Book("978-0134685992", "Effective Java (2nd Edition)", "Joshua Bloch", 45.00));
        bookstore.removeBook(new Book("978-0134685993", "Effective Java (3rd Edition)", "Joshua Bloch", 45.00));

        // Display the updated inventory after removal
        bookstore.displayInventory();

        // Sell some books
        bookstore.sellBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch", 45.00), 3);
        bookstore.sellBook(new Book("978-0596009205", "Head First Java", "Kathy Sierra, Bert Bates", 30.00), 2);

        // Display the updated inventory after sales
        bookstore.displayInventory();
    }
}
