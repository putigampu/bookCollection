package book_collection;

public class Book {
    public static void main(String args[]){
        collectionBooks books = new collectionBooks();
        books.updateCollection("Gorge", 1989);
        books.updateCollection("michael", 1989);
        books.updateCollection("Joseph", 1989);
        books.updateCollection("Catherine", 1989);
        books.updateCollection("Tony", 1989);
        books.collectionList();
        books.updateCollection("Gorge", 1988);
        books.collectionList();
        books.deleteRecord("Joseph", 1988);

    }


}
