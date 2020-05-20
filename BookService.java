package book_collection;

import java.util.HashMap;

public interface BookService {

    void updateCollection(String author, int year);
    void deleteRecord(String author,int year);
    void collectionList();

    
}
