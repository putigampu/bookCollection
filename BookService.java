package collectionbooks;

import java.util.List;

public interface BookService {
    List<Book> getall();
    Book getById(int n);
    void add(Book b);

}
