package collectionbooks;

import java.util.UUID;

public class BookTest {
    public static void main(String[] args){
        BookDAOImpl book_collection = new BookDAOImpl();
        Book one = new Book(98989, "Michael", "Mechanics");
        Book two = new Book(87872, "Gorge", "Economics");
        Book three = new Book(42424, "Tony", "JAVA");
        book_collection.add(one);
        book_collection.add(two);
        book_collection.add(three);
        //for(int books:book_collection.getall())
            //System.out.println(book_collection.getall().toString());
            //System.out.println(book_collection.getall().toString());
        book_collection.getById(UUID.fromString("0baa0f4d-1091-42d2-99f6-20088a6edec2"));
        book_collection.getall().forEach(System.out::println);
    }
}
