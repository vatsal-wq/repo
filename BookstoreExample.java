import java.util.logging.Logger;

public class BookstoreExample {
    private static final Logger logger = Logger.getLogger(BookstoreExample.class.getName());

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Add 10 books to the inventory
        bookstore.addBook(new Book("1234567890", "Book 1", 10.99));
        bookstore.addBook(new Book("2345678901", "Book 2", 12.99));
        bookstore.addBook(new Book("3456789012", "Book 3", 8.99));
        bookstore.addBook(new Book("4567890123", "Book 4", 15.99));
        bookstore.addBook(new Book("5678901234", "Book 5", 6.99));
        bookstore.addBook(new Book("6789012345", "Book 6", 9.99));
        bookstore.addBook(new Book("7890123456", "Book 7", 11.99));
        bookstore.addBook(new Book("8901234567", "Book 8", 7.99));
        bookstore.addBook(new Book("9012345678", "Book 9", 14.99));
        bookstore.addBook(new Book("0123456789", "Book 10", 13.99));

        // Display the initial inventory
        logger.info("Initial Inventory:");
        bookstore.displayInventory();

        // Remove some books from the bookstore
        bookstore.removeBook("3456789012");
        bookstore.removeBook("7890123456");
        bookstore.removeBook("0123456789");

        // Display the updated inventory after removal
        logger.info("Updated Inventory:");
        bookstore.displayInventory();
    }
}
