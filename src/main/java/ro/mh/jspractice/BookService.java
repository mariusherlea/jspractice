package ro.mh.jspractice;

import java.util.Collection;

public interface BookService {

    Collection<Book> getBooks();
    Book addBook(Book book);
}
