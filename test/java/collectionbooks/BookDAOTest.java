package collectionbooks;

import com.sun.source.tree.AssertTree;
import junit.framework.TestCase;
import org.junit.Assert;

public class BookDAOTest extends TestCase {
    BookDAOImpl bookLogic = new BookDAOImpl();
    Book one = new Book(98989, "Michael", "Mechanics");
    Book two = new Book(87872, "Gorge", "Economics");
    Book three = new Book(42424, "Tony", "JAVA");

    public void testGetall() {
        bookLogic.add(one);
        assertTrue(bookLogic.getall().size()==1);
        bookLogic.add(two);
        assertTrue(bookLogic.getall().size()==2);
        bookLogic.add(three);
        assertTrue(bookLogic.getall().size()==3);
    }

    public void testGetById() {
        bookLogic.add(one);
        bookLogic.add(two);
        bookLogic.add(three);
        Book book1 = bookLogic.getById(bookLogic.getUUID());
        Assert.assertTrue(book1 == one || book1 == two || book1==three);
    }
    public void testAdd() {
        bookLogic.add(one);
        assertTrue(bookLogic.books.containsValue(one));
        bookLogic.add(two);
        assertTrue(bookLogic.books.containsValue(two));
        bookLogic.add(three);
        assertTrue(bookLogic.books.containsValue(three));
    }
}