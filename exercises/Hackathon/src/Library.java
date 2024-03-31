import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable{
    private static final long serialVersionUID = 1L;
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> searchResult = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword) || book.getGenre().contains(keyword)) {
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    public boolean checkOutBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }
}