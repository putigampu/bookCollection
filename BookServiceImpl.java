package collectionbooks;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BookServiceImpl implements BookService{
        private BookDAOImpl bookDAO;

        public BookServiceImpl(){
            this.bookDAO = new BookDAOImpl();
        }

    @Override
    public List<Book> getall() {
        return bookDAO.getall();
    }

    @Override
    public Book getById(UUID n) {
        return bookDAO.getById(n);
    }

    @Override
    public UUID add(Book b) {
        UUID id;
        return id = bookDAO.add(b);
    }
}
