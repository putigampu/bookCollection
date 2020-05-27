package collectionbooks;

import java.util.Date;

public class Book {
    int ISBN;
    String author;
    String title;
    Date published_date;
    public Book(int bookISBN, String auth, String title){
        this.author=auth;
        this.title=title;
        this.ISBN=bookISBN;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
