import java.util.logging.Logger;

public class BookstoreExample {
    private static final Logger logger = Logger.getLogger(BookstoreExample.class.getName());

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Add 10 books to the inventory
        bookstore.addBook(new Book("Book 1", 10.99));
        bookstore.addBook(new Book("Book 2", 12.99));
        bookstore.addBook(new Book("Book 3", 8.99));
        bookstore.addBook(new Book("Book 4", 15.99));
        bookstore.addBook(new Book("Book 5", 6.99));
        bookstore.addBook(new Book("Book 6", 9.99));
        bookstore.addBook(new Book("Book 7", 11.99));
        bookstore.addBook(new Book("Book 8", 7.99));
        bookstore.addBook(new Book("Book 9", 14.99));
        bookstore.addBook(new Book("Book 10", 13.99));

        // Display the initial inventory
        logger.info("Initial Inventory:");
        bookstore.displayInventory();

        // Remove some books from the bookstore
        bookstore.removeBook("Book 3");
        bookstore.removeBook("Book 7");
        bookstore.removeBook("Book 10");

        // Display the updated inventory after removal
        logger.info("Updated Inventory:");
        bookstore.displayInventory();
    }
}
