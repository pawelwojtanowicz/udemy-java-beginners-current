package o_o_p_library_app;

import java.util.ArrayList;

public class BookRepository {

    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {

        books.add(new Book("12345", "Pan samochodzik", "children", null, "Zbigniew Nienacki"));
        books.add(new Book("23456", "Witcher", "fantasy", null, "Andrzej Sapkowski"));
        books.add(new Book("34567", "The dead in the night", "horror", null, "Dan Brown"));
        books.add(new Book("45678", "The Castle", "historical", null, "Ian Crow"));
        books.add(new Book("56789", "The plant", "crime fiction", null, "Robert Langdom"));
        books.add(new Book("67890", "White castle", "fantasy", null, "Mick Owl"));
        books.add(new Book("78901", "The castle of dead", "horror", null, "Carol Young"));


    }

    public Book findByIsbn(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;

    }

}