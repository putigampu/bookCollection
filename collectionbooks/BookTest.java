package collectionbooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class BookTest {
    public static void main(String[] args){
        //BookServiceImpl book_collection = new BookServiceImpl();
        BookDAOImpl book_collection = new BookDAOImpl();
        Book one = new Book(98989, "Michael", "Mechanics");
        Book two = new Book(87872, "Gorge", "Economics");
        Book three = new Book(42424, "Tony", "JAVA");
        book_collection.add(one);
        book_collection.add(two);
        book_collection.add(three);
       Book test = book_collection.getById(book_collection.getUUID());
        //book_collection.getall().forEach(System.out::println);
        System.out.println(Arrays.toString(book_collection.getall().toArray()));
    }
}
