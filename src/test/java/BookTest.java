import main.java.org.tpJenkins.exercice1.Book;
import org.testng.annotations.Test;

import java.time.LocalDate;
import static org.testng.AssertJUnit.assertEquals;

public class BookTest {

    @Test
    void testGetTitle() {
        Book b = new Book();
        b.setTitle("titre1");
        b.setAuthor("auteur1");
        b.setPublicationDate("12/05/2005");
        assertEquals("titre1", b.getTitle());
    }

    @Test
    void testGetAuthor(Book book, String expectedAuthor) {
        Book b = new Book();
        b.setTitle("titre1");
        b.setAuthor("auteur1");
        b.setPublicationDate("12/05/2005");
        assertEquals("auteur1", b.getAuthor());
    }


    @Test
    void testGetPublicationDate(Book book, LocalDate expectedPublicationDate) {
        Book b = new Book();
        b.setTitle("titre1");
        b.setAuthor("auteur1");
        b.setPublicationDate("12/05/2005");
        assertEquals("12/05/2005", b.getPublicationDate());
    }
}
