package o_o_p_library_app;

import java.util.ArrayList;

public class BookRepository {

    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository(){
        books.add(new Book("12345", "The Dead of Night", "Horror", "J.S. Smith"));
        books.add(new Book("23456", "The Castle of the Queen", "Historical", "A.S. Anderson"));
        books.add(new Book("34567", "New castle", "Crime fiction", "P.J. Clown"));
        books.add(new Book("45678", "Old castle", "Crime fiction", "P.J. Clown"));
        books.add(new Book("56789", "The another night", "Crime fiction", "P.J. Clown"));

    }

    public Book findByIsbn(String isbn){
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByKeyword(String keyword){
        ArrayList<Book> booksFound = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                booksFound.add(book);
            }
        }
        return booksFound;
    }

}