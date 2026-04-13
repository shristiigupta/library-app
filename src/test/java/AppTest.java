import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void testAddAndGetBook() {
        Long id = app.addBook("Java Programming");
        assertNotNull(id);
        assertEquals("Java Programming", app.getBook(id));
    }

    @Test
    void testUpdateBook() {
        Long id = app.addBook("Old Book");
        boolean updated = app.updateBook(id, "New Book");

        assertTrue(updated);
        assertEquals("New Book", app.getBook(id));
    }

    @Test
    void testDeleteBook() {
        Long id = app.addBook("Delete Me");
        boolean deleted = app.deleteBook(id);

        assertTrue(deleted);
        assertNull(app.getBook(id));
    }
}