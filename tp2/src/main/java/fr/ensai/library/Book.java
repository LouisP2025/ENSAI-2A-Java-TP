package fr.ensai.library;

/**
 * Represents a book.
 */
public class Book {

    // Attributes
    private String isbn;
    private String title;
    private Author author;
    private int year;
    private int pageCount;

    /**
     * Constructs a new Book object.
     */

    public Author getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return title;
    }

    public Book(String isbn, String title, Author author, int year, int pageCount) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return String.format("Book %s written by %s", this.title, this.author);
    }

}
