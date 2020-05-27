package collectionbooks;

import java.util.List;
import java.util.UUID;

public interface BookDAO {
    List<Book> getall();
    Book getById(UUID n);
    UUID add(Book b);
}
