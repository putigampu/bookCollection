package collectionbooks;

import java.util.*;

public class BookDAOImpl implements BookDAO {
    Map<UUID, Book> books = new HashMap<>();
    List<String> ListUUID = new LinkedList<String>();
    UUID id;

    public UUID getUUID(){
        Random rand = new Random();
        return UUID.fromString(ListUUID.get(rand.nextInt(ListUUID.size())));
    }

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
        ListUUID.add(id.toString());
                //getUUID();
        books.put(id,b);
        return id;
    }
}
