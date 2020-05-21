package collectionbooks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookDAO implements BookService {
    Map<Integer, Book> books = new HashMap<Integer, Book>();

    @Override
    public List<Book> getall() {
        List<Book> bookcollection = books.values().stream()
                .collect(Collectors.toList());
        //ArrayList<Book> bookcollection = new ArrayList<Integer>(books.values());
        return bookcollection;
    }

    @Override
    public Book getById(int n) {
        return books.get(n);
    }

    @Override
    public void add(Book b) {
        books.put(b.ISBN,b);

    }
}
