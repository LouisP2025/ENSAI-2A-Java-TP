package fr.ensai.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    // Attributes
    private String name;
    private List<Book> Books;

    /**
     * Constructs a new Library object.
     */
    public Library(String name) {
        this.name = name;
        this.Books = new ArrayList<>();
    }

    // Method to add a book to the library's collection
    public void addIem(Book Book) {
        this.Books.add(Book);
    }

    /**
     * Displays all Books currently present in the library.
     */
    public void displayBooks() {
        if (this.Books.isEmpty()) {
            System.out.println("\n[!] The library is empty.");
            return;
        }

        String rowFormat = "| %-10s | %-50s |%n";
        String separator = "+------------+----------------------------------------------------+";

        System.out.println("\n" + separator);
        System.out.printf(rowFormat, "Type", "Title");
        System.out.println(separator);

        for (Book b : this.Books) {
            System.out.printf(rowFormat,
                    b.getClass().getSimpleName(),
                    b.getTitle());
        }

        System.out.println(separator);
    }

    /**
     * Loads books from a CSV file and adds them to the library.
     * 
     * @param filePath The path to the CSV file containing book data.
     * @throws IOException If there is an error reading the file, an
     *                     {@link IOException} will be thrown.
     */
    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String authorName = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(authorName);
                    if (author == null) {
                        author = new Author(authorName);
                        authors.put(authorName, author);
                        System.out.println(String.format("Create %s", author));
                    }
                    Book book = new Book(isbn, title, author, year, pageCount);

                    this.addIem(book);
                }
            }
        } catch (

        IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

}