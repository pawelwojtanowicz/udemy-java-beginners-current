package o_o_p_library_app;


public class Main {
    public static void main(String[] args) {

        LibraryApp app = new LibraryApp();
        app.searchByIsbn("12345");
        app.searchByIsbn("23456");
        app.searchByIsbn("13456");
        app.searchByIsbn("34567");

    }

}