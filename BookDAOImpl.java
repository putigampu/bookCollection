package collectionbooks;

import java.util.*;

public class BookDAOImpl implements BookDAO {
    Map<UUID, Book> books = new HashMap<>();

    @Override
    public List<Book> getall() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Book getById(UUID n) {
        return books.get(n);
    }

    @Override
    public UUID add(Book b) {
        UUID id = UUID.randomUUID();
        books.put(id,b);
        return id;
    }
}
