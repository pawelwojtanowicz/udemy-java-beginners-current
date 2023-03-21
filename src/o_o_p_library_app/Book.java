package o_o_p_library_app;

public class Book {

    private String isbn;
    private String title;
    private String genre;
    private String author;

    public Book(String isbn, String title, String genre, String author){

        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.author = author;

    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }
}