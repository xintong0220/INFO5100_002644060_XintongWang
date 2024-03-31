import java.io.Serializable;

public class Book implements Serializable{
    private static final long serialVersionUID = 1L;
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private boolean isAvailable;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.isAvailable = true; // A new book is always available when added.
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Genre: %s, ISBN: %s, Available: %s",
                title, author, genre, isbn, isAvailable ? "Yes" : "No");
    }
}

