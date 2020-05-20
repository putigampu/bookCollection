package book_collection;

import java.util.HashMap;

public class collectionBooks implements BookService {

    HashMap<String, Integer> bookCollection = new HashMap<String, Integer>();

    public void updateCollection(String author, int year) {
        if (bookCollection.containsKey(author))
            bookCollection.put(author, year);
        else
            bookCollection.put(author, year);
        System.out.println("record added");
    }

    public void deleteRecord(String author, int year) {
        if(bookCollection.containsKey(author) && bookCollection.get(author)==year)
                bookCollection.remove(author);
        else
            System.out.println("This book is not available");
    }
    public void collectionList() {
        bookCollection.forEach((k,v)->System.out.println("Author : " + k + " Year: " + v));
    }
}
