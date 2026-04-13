import java.util.*;

public class App {

    private Map<Long, String> books = new HashMap<>();
    private long nextId = 1;

    // CREATE BOOK
    public Long addBook(String bookName) {
        if (bookName == null || bookName.trim().isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be empty");
        }
        Long id = nextId++;
        books.put(id, bookName);
        return id;
    }

    // READ BOOK
    public String getBook(Long id) {
        return books.get(id);
    }

    // UPDATE BOOK
    public boolean updateBook(Long id, String newName) {
        if (books.containsKey(id)) {
            books.put(id, newName);
            return true;
        }
        return false;
    }

    // DELETE BOOK
    public boolean deleteBook(Long id) {
        return books.remove(id) != null;
    }

    public static void main(String[] args) {
        System.out.println("Library Book Management System running...");
    }
}