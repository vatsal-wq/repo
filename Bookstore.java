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
        inventory.put(book.getTitle(), book);
        logger.info("Added book: " + book);
    }

    public void removeBook(String title) {
        Book removedBook = inventory.remove(title);
        if (removedBook != null) {
            logger.info("Removed book: " + removedBook);
        } else {
            logger.warning("Book not found: " + title);
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
