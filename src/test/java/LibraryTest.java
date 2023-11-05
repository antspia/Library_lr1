import org.example.Library;
import org.example.Book;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    @Before
    public void setUp() {
        library = new Library();
        book1 = new Book("The Stranger", "Albert Camus", "9780679720201", 1989);
        book2 = new Book("The Trial", "Franz Kafka", "9786171500983", 1925);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void testFindBook() {
        Book foundBook = library.findBook("9780679720201");
        assertNotNull(foundBook);
        assertEquals(book1, foundBook);

        foundBook = library.findBook("1111111111");
        assertNull(foundBook);
    }

    @Test
    public void testRemoveBook() {
        library.removeBook("9780679720201");
        assertNull(library.findBook("9780679720201"));
    }

    @Test
    public void testRemoveNonExistentBook() {
        library.removeBook("1111111111");
        assertNotNull(library.findBook("9780679720201"));
    }
}
