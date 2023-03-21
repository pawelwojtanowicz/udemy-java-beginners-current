package o_o_p_library_app;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepository = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for books with ISBN %s\n", isbn);
        Book book = bookRepository.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
        } else {
            System.out.println("0 books found");
        }
        System.out.println("\n\n");
    }

    public void searchByKeyword(String keyword) {
        System.out.printf("Searching for books with keyword %s in the title\n", keyword);

        ArrayList<Book> books = bookRepository.findByKeyword(keyword);
        System.out.printf("%s books found%s\n", books.size(), books.size() > 0 ? ":":"." );
        for(Book book : books){
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor: %s\n\t---\n", book.getTitle(), book.getGenre(), book.getAuthor());
        }
        System.out.println("\n");
    }

}