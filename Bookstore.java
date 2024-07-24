import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Bookstore {
    private static final Logger logger = Logger.getLogger(Bookstore.class.getName());
    private Map<String, Book> inventory;

    public Bookstore() {
        inventory = new HashMap<>();
    }

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        logger.info("Added book: " + book);
    }

    public void removeBook(String isbn) {
        Book removedBook = inventory.remove(isbn);
        if (removedBook != null) {
            logger.info("Removed book: " + removedBook);
        } else {
            logger.warning("Book not found with ISBN: " + isbn);
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            logger.info("No books in inventory.");
        } else {
            logger.info("Inventory:");
            for (Book book : inventory.values()) {
                logger.info(book.toString());
            }
        }
    }
}
