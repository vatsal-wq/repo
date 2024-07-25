import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Bookstore {
    private static final Logger logger = Logger.getLogger(Bookstore.class.getName());
    private Map<Book, Integer> inventory;
    private Map<Book, Integer> sold;

    public Bookstore() {
        inventory = new HashMap<>();
        sold = new HashMap<>();
    }

    public void addBook(Book book, int quantity) {
        inventory.put(book, quantity);
        sold.put(book, 0);
        logger.info("Added book: " + book + " with quantity: " + quantity);
    }

    public void removeBook(Book book) {
        if (inventory.containsKey(book)) {
            inventory.remove(book);
            sold.remove(book);
            logger.info("Removed book: " + book);
        } else {
            logger.warning("Book not found: " + book);
        }
    }

    public void sellBook(Book book, int quantity) {
        if (inventory.containsKey(book)) {
            int currentInventory = inventory.get(book);
            if (currentInventory >= quantity) {
                inventory.put(book, currentInventory - quantity);
                sold.put(book, sold.get(book) + quantity);
                logger.info("Sold " + quantity + " copies of book: " + book);
            } else {
                logger.warning("Not enough inventory for book: " + book);
            }
        } else {
            logger.warning("Book not found: " + book);
        }
    }

    public void displayInventory() {
        logger.info("Current Inventory:");
        for (Map.Entry<Book, Integer> entry : inventory.entrySet()) {
            Book book = entry.getKey();
            int quantity = entry.getValue();
            logger.info(book.toString() + ", Quantity: " + quantity + ", Sold: " + sold.get(book));
      
